package com.ccl.documentmanagementintapi.services;

import com.ccl.architecture.tracing.core.interline.TracingLogService;
import com.ccl.documentmanagementintapi.config.ThumbnailPermissionService;
import com.ccl.documentmanagementintapi.domain.dtos.storage.document.ResponseType;
import com.ccl.documentmanagementintapi.domain.ws.document.DocumentProcessRequestType;
import com.ccl.documentmanagementintapi.domain.ws.upload.UploadResponseType;
import com.ccl.documentmanagementintapi.exceptions.NoImageContentException;
import com.ccl.documentmanagementintapi.mappers.CreateThumbnailMapper;
import com.ccl.documentmanagementintapi.mappers.DeleteDocumentNotificationMapper;
import com.ccl.documentmanagementintapi.mappers.UploadDocumentMapper;
import com.ccl.documentmanagementintapi.mappers.UploadDocumentNotificationMapper;
import com.ccl.documentmanagementintapi.services.utils.TfnasProcessService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.Optional;

@Slf4j
@Service
public class DocumentManagementServiceImpl implements DocumentManagementService {

    @Resource
    private DocumentStorageService documentStorageService;

    @Resource
    private UploadDocumentMapper uploadDocumentMapper;

    @Resource
    private UploadDocumentNotificationMapper uploadDocumentNotificationMapper;

    @Resource
    private DeleteDocumentNotificationMapper deleteDocumentNotificationMapper;

    @Resource
    private CreateThumbnailMapper createThumbnailMapper;

    @Resource
    private ThumbnailPermissionService thumbnailPermissionService;

    @Resource
    private ThumbnailService thumbnailService;

    @Resource
    private NotificationService notificationService;

    @Resource
    private TracingLogService tracingLogService;

    @Lazy
    @Resource
    private TfnasProcessService tfnasProcessService;

    @Async
    @Override
    public void processUploadDocumentAsync(DocumentProcessRequestType documentProcessRequest, Boolean reprocess) {
        processUploadDocument(documentProcessRequest, reprocess);
    }

    @Override
    public UploadResponseType processUploadDocument(DocumentProcessRequestType documentProcessRequest, Boolean reprocess) {
        String application = null;
        String user = null;
        String appVersion = null;
        if(ObjectUtils.isNotEmpty(documentProcessRequest.getAbastData()) && ObjectUtils.isNotEmpty(documentProcessRequest.getAbastData().getApplication())){
            application = documentProcessRequest.getAbastData().getApplication();
        }
        if(ObjectUtils.isNotEmpty(documentProcessRequest.getAbastData()) && ObjectUtils.isNotEmpty(documentProcessRequest.getAbastData().getUser())){
            user = documentProcessRequest.getAbastData().getUser();
        }
        if(ObjectUtils.isNotEmpty(documentProcessRequest.getDocument().getInfoDevice()) && ObjectUtils.isNotEmpty(documentProcessRequest.getDocument().getInfoDevice().getAppVersion())){
            appVersion = documentProcessRequest.getDocument().getInfoDevice().getAppVersion();
        }
        try {
            if (ObjectUtils.isNotEmpty(documentProcessRequest.getDocument()) && StringUtils.isNotEmpty(documentProcessRequest.getDocument().getLocator())) {
                if (ObjectUtils.isNotEmpty(documentProcessRequest.getDocument().getImageContent())) {
                    // upload document to document storage
                    Optional<ResponseType> uploadDocumentResponse = Optional.ofNullable(documentStorageService.uploadDocument(uploadDocumentMapper.dDocumentProcessRequestTypeToRequestType(documentProcessRequest)));
                    if (uploadDocumentResponse.isPresent() && ObjectUtils.isNotEmpty(uploadDocumentResponse) && uploadDocumentResponse.get().getCodigo().equals("201") && StringUtils.isNotEmpty(uploadDocumentResponse.get().getItem().getCabecera().getId().toString())) {
                        log.info("Document properly stored with storage id: {}", uploadDocumentResponse.get().getItem().getCabecera().getId());

                        // publish notification
                        notificationService.publishNotification(uploadDocumentNotificationMapper.dDocumentProcessRequestTypeToNotificationType(uploadDocumentResponse.get().getItem().getCabecera().getId().toString(), null, documentProcessRequest));

                        // TODO: check permissions when origin is ANUBIS but is related to i.e. AMOB_TERMINAL (how to filter?)
                        boolean generateThumbnail = false;
                        generateThumbnail = thumbnailPermissionService.checkThumbnailPermission(Integer.valueOf(documentProcessRequest.getDocument().getCategory()), documentProcessRequest.getNotificationData().getOrigin());
                        if (generateThumbnail) {
                            try {
                                thumbnailService.processThumbnail(createThumbnailMapper.dDocumentProcessRequestTypeToThumbnailProcessRequestType(uploadDocumentResponse.get().getItem().getCabecera().getId().toString(), documentProcessRequest));
                            } catch (Exception ex) {
                                String message = ex.getMessage();
                                log.error(message, ex);
                                notificationService.publishNotification(uploadDocumentNotificationMapper.dDocumentProcessRequestTypeToNotificationType(null, Objects.toString(uploadDocumentResponse, message), documentProcessRequest));
                            }
                        } else {
                            log.debug("No thumbnail created for category: {}, origin: {}", documentProcessRequest.getDocument().getCategory(), documentProcessRequest.getNotificationData().getOrigin());
                        }
                        return UploadResponseType.builder()
                                .cdError(uploadDocumentResponse.get().getCodigo())
                                .id(uploadDocumentResponse.get().getItem().getCabecera().getId().toString())
                                .build();
                    } else {
                        log.error("Error storing document with EXCEPTION: {}", ObjectUtils.defaultIfNull(uploadDocumentResponse, ""));
                        notificationService.publishNotification(uploadDocumentNotificationMapper.dDocumentProcessRequestTypeToNotificationType(null, Objects.toString(uploadDocumentResponse, "Error storing document to Scanvisio"), documentProcessRequest));
                        String cdError = null;
                        if (uploadDocumentResponse.isPresent() && ObjectUtils.isNotEmpty(uploadDocumentResponse) && StringUtils.isNotEmpty(uploadDocumentResponse.get().getCodigo())) {
                            cdError = uploadDocumentResponse.get().getCodigo();
                        }

                        if (Boolean.TRUE.equals(reprocess))
                            tfnasProcessService.savePendingDocumentToTfnasFolder(documentProcessRequest);
                        else
                            log.info("Document without reprocessing: {}", BooleanUtils.toStringTrueFalse(reprocess));

                        return UploadResponseType.builder()
                                .cdError(cdError)
                                .dsError("Error storing document to Scanvisio")
                                .build();
                    }
                } else {
                    log.info("No Image content, message not processed, locator associated: {}, Aplication: {}, User: {}, App version: {}",
                            documentProcessRequest.getDocument().getLocator(), application,
                            user, appVersion);
                    throw new NoImageContentException(user,documentProcessRequest.getDocument().getLocator(), application);
                }
            } else {
                log.info("No locator found associated to the document so it has been removed");
                // TODO: ¿redis?
                // if not locator
                // wait for associated data (locator+numDocs)
                // wait for all related documents (numDocs)
                // if locator
                // upload doc (scanvisio storeDoc)
                // if-ok -> create uploadDoc notification
                // if origin==allowed && category==allowed
                // call create thumbnail
                // if not locator -> exit (remove doc)
                return UploadResponseType.builder()
                        .cdError(null)
                        .dsError("No locator found associated to the document so it has been removed")
                        .build();
            }
        } catch (NoImageContentException e) {
            log.error("Error processing document: {}", ExceptionUtils.getStackTrace(e));
            tracingLogService.error("No Image content, message not processed, locator associated: " +  documentProcessRequest.getDocument().getLocator() + ", User: " + user + "AppVersion: " + appVersion, e);
            return UploadResponseType.builder()
                    .cdError(null)
                    .dsError("No Image content, message not processed, locator associated: " + documentProcessRequest.getDocument().getLocator())
                    .build();
        } catch (Exception e) {
            log.error("Error processing document: {}", ExceptionUtils.getStackTrace(e));

            if (Boolean.TRUE.equals(reprocess))
                tfnasProcessService.savePendingDocumentToTfnasFolder(documentProcessRequest);
            else
                log.info("Document without reprocessing: {}", BooleanUtils.toStringTrueFalse(reprocess));

            return UploadResponseType.builder()
                    .cdError(null)
                    .dsError(ExceptionUtils.getStackTrace(e))
                    .build();
        }
    }

    @Override
    public void processDeleteDocument(DocumentProcessRequestType documentProcessRequest) {
        try {
            Optional<ResponseType> deleteDocumentResponse = Optional.ofNullable(documentStorageService.deleteDocument(documentProcessRequest.getAbastData().getIdScanvisioDocument()));

            if (deleteDocumentResponse.isPresent() && ObjectUtils.isNotEmpty(deleteDocumentResponse) && StringUtils.equals(deleteDocumentResponse.get().getCodigo(), "200")) {
                log.info("Document properly removed with storage id: {}", deleteDocumentResponse.get().getItem().getCabecera().getId());

                // publish notification
                notificationService.publishNotification(deleteDocumentNotificationMapper.dDocumentProcessRequestTypeToNotificationType(deleteDocumentResponse.get().getItem().getCabecera().getId().toString(), null, documentProcessRequest));
            } else {
                log.error("Error removing document from Scanvisio with EXCEPTION: {}", ObjectUtils.defaultIfNull(deleteDocumentResponse, ""));
                notificationService.publishNotification(deleteDocumentNotificationMapper.dDocumentProcessRequestTypeToNotificationType(documentProcessRequest.getAbastData().getIdScanvisioDocument().toString(), deleteDocumentResponse.toString(), documentProcessRequest));
            }
        } catch (Exception e) {
            log.error("Error processing document: {}", ExceptionUtils.getStackTrace(e));
        }
    }

}
