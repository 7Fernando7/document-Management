package com.ccl.documentmanagementintapi.controllers;

import com.ccl.architecture.tracing.annotations.Trace;
import com.ccl.documentmanagementintapi.domain.dtos.storage.document.RequestType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.download.DocumentResponse;
import com.ccl.documentmanagementintapi.domain.ws.anubisabastdocument.RequestDeleteType;
import com.ccl.documentmanagementintapi.domain.ws.anubisabastdocument.RequestDownloadType;
import com.ccl.documentmanagementintapi.domain.ws.anubisabastdocument.RequestUploadType;
import com.ccl.documentmanagementintapi.domain.ws.anubisabastdocument.ResponseType;
import com.ccl.documentmanagementintapi.mappers.AnubisAbastDocumentMapper;
import com.ccl.documentmanagementintapi.mappers.DocumentMapper;
import com.ccl.documentmanagementintapi.services.DocumentStorageService;
import com.ccl.documentmanagementintapi.services.ScanvisioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.annotation.Resource;

@Slf4j
@Endpoint
public class AnubisAbastDocumentEndpoint {

    @Value("${min.id.document.storage}")
    private Integer minIdDocumentStorage;

    @Autowired
    private ScanvisioService scanvisioService;

    @Resource
    private DocumentStorageService documentStorageService;

    @Autowired
    private AnubisAbastDocumentMapper anubisAbastDocumentMapper;

    @Autowired
    private DocumentMapper documentMapper;

    @Trace(operation = "VISUALIZE_DOCUMENT")
    @PayloadRoot(namespace = "http://www.transfesa.com/api_anubis_document/AnubisAbastDocument", localPart = "RequestDownload")
    @ResponsePayload
    public ResponseType visualizeDocument(@RequestPayload RequestDownloadType requestDownloadType) {
        log.info("Start Flow Ws Visualize Document");
        ResponseType responseType = new ResponseType();

        try {
            if (requestDownloadType.getID() >= minIdDocumentStorage) {
                log.debug("Document download from document storage: {}", requestDownloadType.getID());
                DocumentResponse documentResponse = documentStorageService.downloadDocument(requestDownloadType.getID());
                responseType = anubisAbastDocumentMapper.convertDocumentResponseToResponseType(documentResponse);
            } else {
                log.debug("Document download from scanviso: {}", requestDownloadType.getID());
                DocumentResponse documentResponse = scanvisioService.downloadDocument(requestDownloadType.getID());
                responseType = anubisAbastDocumentMapper.convertDocumentResponseToResponseType(documentResponse);
            }

        } catch (Exception e) {
            responseType.setCodigo(500);
            responseType.setDsError(e.getMessage());
        }

        return responseType;
    }

    @Trace(operation = "DELETE_DOCUMENT")
    @PayloadRoot(namespace = "http://www.transfesa.com/api_anubis_document/AnubisAbastDocument", localPart = "RequestDelete")
    @ResponsePayload
    public ResponseType deleteDocument(@RequestPayload RequestDeleteType requestDeleteType) {
        log.info("Start Flow Ws Delete Document");
        ResponseType responseType = new ResponseType();

        try {
            com.ccl.documentmanagementintapi.domain.dtos.storage.document.ResponseType responseTypeScanvisio = documentStorageService.deleteDocument(requestDeleteType.getID());
            responseType = documentMapper.documentResponseMapper(responseTypeScanvisio);
        } catch (Exception e) {
            responseType.setCodigo(500);
            responseType.setDsError(e.getMessage());
        }

        return responseType;
    }

    @Trace(operation = "UPLOAD_DOCUMENT")
    @PayloadRoot(namespace = "http://www.transfesa.com/api_anubis_document/AnubisAbastDocument", localPart = "RequestUpload")
    @ResponsePayload
    public ResponseType uploadDocument(@RequestPayload RequestUploadType requestUploadType) {
        log.info("Start Flow Ws Upload Document");
        ResponseType responseType = new ResponseType();

        try {
            RequestType requestType = documentMapper.convertRequestUploadTypeToRequestType(requestUploadType);
            com.ccl.documentmanagementintapi.domain.dtos.storage.document.ResponseType responseTypeScanvisio = documentStorageService.uploadDocument(requestType);
            responseType = documentMapper.documentResponseMapper(responseTypeScanvisio);
        } catch (Exception e) {
            responseType.setCodigo(500);
            responseType.setDsError(e.getMessage());
        }

        return responseType;
    }

}
