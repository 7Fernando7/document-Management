package com.ccl.documentmanagementintapi.mappers;

import com.ccl.documentmanagementintapi.domain.dtos.storage.document.RequestType;
import com.ccl.documentmanagementintapi.domain.ws.anubisabastdocument.RequestUploadType;
import com.ccl.documentmanagementintapi.domain.ws.anubisabastdocument.ResponseType;

public interface DocumentMapper {
    RequestType convertRequestUploadTypeToRequestType(RequestUploadType requestUploadType);
    ResponseType documentResponseMapper(com.ccl.documentmanagementintapi.domain.dtos.storage.document.ResponseType responseTypeScanvisio);
}
