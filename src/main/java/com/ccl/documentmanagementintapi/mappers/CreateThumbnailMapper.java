package com.ccl.documentmanagementintapi.mappers;

import com.ccl.documentmanagementintapi.domain.ws.document.DocumentProcessRequestType;
import com.ccl.documentmanagementintapi.domain.ws.thumbnail.ThumbnailProcessRequestType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CreateThumbnailMapper {

    @Mappings({
            @Mapping(target = "uuid", source = "documentProcessRequestType.uuid"),
            @Mapping(target = "notificationData.origin", source = "documentProcessRequestType.notificationData.origin"),
            @Mapping(target = "notificationData.operationType", constant = "UPLOAD_THUMBNAIL_NOTIFICATION"),
            @Mapping(target = "abastData", source = "documentProcessRequestType.abastData"),
            @Mapping(target = "document", source = "documentProcessRequestType.document"),
            @Mapping(target = "additionalData.abastId", source = "idScanvisio")
    })
    ThumbnailProcessRequestType dDocumentProcessRequestTypeToThumbnailProcessRequestType(String idScanvisio, DocumentProcessRequestType documentProcessRequestType);
}
