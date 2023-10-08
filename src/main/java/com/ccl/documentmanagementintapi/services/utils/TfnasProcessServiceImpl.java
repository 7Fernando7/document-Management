package com.ccl.documentmanagementintapi.services.utils;

import com.ccl.documentmanagementintapi.domain.ws.document.DocumentProcessRequestType;
import com.ccl.documentmanagementintapi.services.DocumentManagementService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

@Lazy
@Service
@Slf4j
public class TfnasProcessServiceImpl implements TfnasProcessService {

    @Value("${document.management.tfnas.documents.folder}pending")
    private String pendingFolderPath;

    @Value("${document.management.tfnas.documents.folder}inprocess")
    private String inProcessFolderPath;

    @Value("${document.management.tfnas.documents.folder}processed")
    private String processedFolderPath;

    @Value("${document.management.file.pending.max.time}")
    private Long maxPendingTime;

    @Value("${document.management.file.removal.max.time}")
    private Long maxRemovalTime;

    @Resource
    private DocumentManagementService documentManagementService;

    @Override
    public void savePendingDocumentToTfnasFolder(DocumentProcessRequestType documentProcessRequest) {
        try {
            String uuid = java.util.UUID.randomUUID().toString();
            String documentName = pendingFolderPath + File.separator + documentProcessRequest.getDocument().getLocator() + File.separator + uuid + ".json";
            File documentFile = new File(documentName);

            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.findAndRegisterModules();
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            String json = mapper.writeValueAsString(documentProcessRequest);
            FileUtils.writeStringToFile(documentFile, json, StandardCharsets.UTF_8);

            log.info("Document with Locator: {} sent to TFNAS Folder: {}", documentProcessRequest.getDocument().getLocator(), documentName);

        } catch (IOException e) {
            log.error("Error - sending documentProcessRequest to TFNAS folder with EXCEPTION: {}", ExceptionUtils.getStackTrace(e));
        }
    }

    private void processTfnasDocuments(String folderToProcess) {

        File inProcessFolder = new File(inProcessFolderPath + File.separator + folderToProcess);
        File processedFolder = new File(processedFolderPath + File.separator + getProcessedFolderName(folderToProcess));

        if (inProcessFolder.exists()) {
            log.info("Reading documents from folder: {}", inProcessFolder.getName());
            File[] fileList = inProcessFolder.listFiles();

            if (ArrayUtils.isNotEmpty(fileList)) {
                assert fileList != null;
                for (File document : fileList) {

                    ObjectMapper mapper = new ObjectMapper();
                    mapper.registerModule(new JavaTimeModule());
                    mapper.findAndRegisterModules();
                    mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);

                    try {
                        DocumentProcessRequestType documentProcessRequestType = mapper.readValue(document, DocumentProcessRequestType.class);
                        documentManagementService.processUploadDocument(documentProcessRequestType, true);

                    } catch (IOException e) {
                        log.error("Error - Reading documentRequest from TFNAS folder with EXCEPTION: {}", ExceptionUtils.getStackTrace(e));
                    }
                }
                try {
                    log.info("Processed documents from folder: {}", inProcessFolder.getName());
                    if (processedFolder.exists()) {
                        FileUtils.cleanDirectory(processedFolder);
                    }
                    FileUtils.copyDirectory(inProcessFolder, processedFolder);
                    FileUtils.deleteQuietly(inProcessFolder);
                } catch (IOException e) {
                    log.error("Error - Moving document to TFNAS folder with EXCEPTION: {}", ExceptionUtils.getStackTrace(e));
                }
            } else {
                log.info("Not processed document from empty folder: {}", inProcessFolder.getName());
            }

        } else {
            log.info("No folder located with name: {}", inProcessFolder.getName());
        }

    }

    @Async
    @Override
    public void processPendingFolders() {
        File dir = new File(pendingFolderPath);

        File[] files = dir.listFiles();

        if (ArrayUtils.isNotEmpty(files)) {
            long latestDate = System.currentTimeMillis() - maxPendingTime;

            assert files != null;
            for (File pendingFolder : files) {
                if (pendingFolder.isDirectory()) {
                    Long fileModifiedDate = pendingFolder.lastModified();

                    if (ObjectUtils.isNotEmpty(fileModifiedDate) && fileModifiedDate < latestDate) {
                        String pendingFolderName = pendingFolder.getName();
                        File inProcessFolder = new File(inProcessFolderPath + File.separator + pendingFolderName);
                        String inProcessFolderName = inProcessFolder.getName();

                        if (assignableInProcessFolder(inProcessFolder)) {

                            try {
                                FileUtils.moveDirectory(pendingFolder, inProcessFolder);
                                log.info("Pending directory path: {}, modification time: {}, moved to inProcess folder: {}", pendingFolderName, fileModifiedDate, inProcessFolderName);
                            } catch (IOException e) {
                                log.error("Impossible to process folder: {} with EXCEPTION: {}", pendingFolderName, ExceptionUtils.getStackTrace(e));
                                continue;
                            }

                            processTfnasDocuments(inProcessFolderName);
                        } else {
                            log.trace("Non processable directory/file path: {}", inProcessFolderName);
                        }
                    } else {
                        log.debug("Too recent directory path: {}, modification time: {}. It will be reprocessed later.", pendingFolder.getName(), fileModifiedDate);
                    }
                } else {
                    log.trace("Non processable directory/file path: {}", pendingFolder.getName());
                }
            }
        }
    }

    @Async
    @Override
    public void removeOldFolders() {
        File dir = new File(processedFolderPath);

        File[] files = dir.listFiles();

        if (ArrayUtils.isNotEmpty(files)) {
            long latestDate = System.currentTimeMillis() - maxRemovalTime;

            assert files != null;
            for (File folder : files) {
                if (folder.isDirectory()) {
                    String folderName = folder.getName();
                    Long fileModifiedDate = folder.lastModified();

                    if (ObjectUtils.isNotEmpty(fileModifiedDate) && fileModifiedDate < latestDate) {
                        log.info("Pending directory path: {}, modification time: {}", folderName, fileModifiedDate);
                        FileUtils.deleteQuietly(folder);
                        log.info("Folder {} removed", folderName);
                    } else {
                        log.debug("Recent directory path: {}, modification time: {}", folderName, fileModifiedDate);
                    }

                } else {
                    log.trace("Non processable directory/file path: {}", folder.getName());
                }
            }
        }
    }

    private String getProcessedFolderName(String rootPrefix) {
        return ObjectUtils.defaultIfNull(searchExistingFolder(rootPrefix), rootPrefix + "_" + getFormattedOffsetDateTime());
    }

    private String searchExistingFolder(String rootPrefixFolderName) {
        File directoryPath = new File(processedFolderPath);

        FilenameFilter folderNameFilter = (dir, name) -> name.startsWith(rootPrefixFolderName + "_");
        File[] filesList = directoryPath.listFiles(folderNameFilter);
        if (ObjectUtils.isNotEmpty(filesList) && filesList.length > 0 && filesList[0].isDirectory()) {
            return filesList[0].getName();
        } else return null;
    }

    private String getFormattedOffsetDateTime() {
        return OffsetDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmssxx"));
    }

    private boolean assignableInProcessFolder(File inProcessFolder) {
        Path folderPath = inProcessFolder.toPath();
        if (existsFolder(folderPath)) {

            if (checkEmptyFolder(folderPath)) {
                return removeFolder(inProcessFolder);
            }else return false;

        } else return true;
    }

    private boolean existsFolder(Path path) {
        return Files.exists(path) && Files.isDirectory(path); //TODO: check same method (isDirectory includes exists ¿?)
    }

    private boolean checkEmptyFolder(Path path) {
        try (Stream<Path> entries = Files.list(path)) {
            return !entries.findFirst().isPresent();
        } catch (IOException e) {
            return false;
        }
    }

    private boolean removeFolder(File inProcessFolder) {
        return FileUtils.deleteQuietly(inProcessFolder);
    }

}
