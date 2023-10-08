package com.ccl.documentmanagementintapi.services;

import com.ccl.documentmanagementintapi.domain.dtos.storage.document.RequestType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.document.ResponseType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.download.DocumentResponse;

public interface ScanvisioService {

    ResponseType uploadDocument(RequestType requestType);

    ResponseType deleteDocument(Integer idScanvisio);

    DocumentResponse downloadDocument(Integer idScanvisio);

}
