package com.ccl.documentmanagementintapi.services.utils;

import com.ccl.documentmanagementintapi.domain.ws.document.DocumentProcessRequestType;

public interface TfnasProcessService {

    void savePendingDocumentToTfnasFolder(DocumentProcessRequestType documentProcessRequest);

    void processPendingFolders();

    void removeOldFolders();

}
