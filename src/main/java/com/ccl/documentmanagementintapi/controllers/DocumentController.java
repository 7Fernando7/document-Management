package com.ccl.documentmanagementintapi.controllers;

import com.ccl.architecture.elasticsearch.logger.annotations.DefineRequestLogger;
import com.ccl.architecture.elasticsearch.logger.dtos.LogLevels;
import com.ccl.architecture.tracing.annotations.Trace;
import com.ccl.documentmanagementintapi.domain.dtos.storage.download.DocumentResponse;
import com.ccl.documentmanagementintapi.domain.ws.document.DocumentProcessRequestType;
import com.ccl.documentmanagementintapi.domain.ws.upload.UploadResponseType;
import com.ccl.documentmanagementintapi.services.DocumentManagementService;
import com.ccl.documentmanagementintapi.services.DocumentStorageService;
import com.ccl.documentmanagementintapi.services.ScanvisioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Slf4j
@RestController
public class DocumentController {

    @Value("${min.id.document.storage}")
    private Integer minIdDocumentStorage;

    @Resource
    private DocumentManagementService documentManagementService;

    @Resource
    private ScanvisioService scanvisioService;

    @Resource
    private DocumentStorageService documentStorageService;

    @Trace(operation = "Process document")
    @PostMapping("/document")
    @DefineRequestLogger(inbound = LogLevels.DEBUG, outbound = LogLevels.DEBUG)
    public void processDocument(@Valid @RequestBody DocumentProcessRequestType documentProcessRequest) {
        log.info("Uploading document");
        log.debug("Document entrance request: {}", documentProcessRequest);

        documentManagementService.processUploadDocumentAsync(documentProcessRequest, true);
    }

    @Trace(operation = "Process document")
    @PostMapping("/documentResponse")
    @DefineRequestLogger(inbound = LogLevels.DEBUG, outbound = LogLevels.DEBUG)
    public UploadResponseType processDocumentWithResponse(@Valid @RequestBody DocumentProcessRequestType documentProcessRequest) {
        log.info("Uploading document");
        log.debug("Document entrance request: {}", documentProcessRequest);

        return documentManagementService.processUploadDocument(documentProcessRequest, false);
    }

    @Trace(operation = "Fetch document")
    @GetMapping("/document")
    @DefineRequestLogger(inbound = LogLevels.DEBUG, outbound = LogLevels.DEBUG)
    public DocumentResponse fetchDocument(@Valid @RequestParam Integer id) {
        log.info("Downloading document");
        log.debug("Document id entrance request: {}", id);

        try {
            if (id >= minIdDocumentStorage) {
                log.debug("Document download from document storage: {}", id);
                return documentStorageService.downloadDocument(id);
            } else {
                log.debug("Document download from scanvisio: {}", id);
                return scanvisioService.downloadDocument(id);
            }
        } catch (Exception e) {
            return DocumentResponse.builder()
                    .code("500 - Internal Server Error")
                    .build();
        }

    }

}
