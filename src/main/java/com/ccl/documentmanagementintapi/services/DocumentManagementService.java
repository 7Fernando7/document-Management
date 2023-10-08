package com.ccl.documentmanagementintapi.services;

import com.ccl.documentmanagementintapi.domain.ws.document.DocumentProcessRequestType;
import com.ccl.documentmanagementintapi.domain.ws.upload.UploadResponseType;

public interface DocumentManagementService {

    void processUploadDocumentAsync(DocumentProcessRequestType documentProcessRequestType, Boolean reprocess);

    UploadResponseType processUploadDocument(DocumentProcessRequestType documentProcessRequestType, Boolean reprocess);

    void processDeleteDocument(DocumentProcessRequestType documentProcessRequest);

}
