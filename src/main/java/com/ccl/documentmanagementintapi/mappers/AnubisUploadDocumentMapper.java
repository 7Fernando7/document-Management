package com.ccl.documentmanagementintapi.mappers;

import com.ccl.documentmanagementintapi.domain.dtos.cidocument.DOCIDocument;
import com.ccl.documentmanagementintapi.domain.dtos.cidocument.DODocument;
import com.ccl.documentmanagementintapi.domain.dtos.cidocument.DOFile;
import com.ccl.documentmanagementintapi.domain.ws.document.AbastDataType;
import com.ccl.documentmanagementintapi.domain.ws.document.DocumentProcessRequestType;
import com.ccl.documentmanagementintapi.domain.ws.document.DocumentType;
import org.mapstruct.*;

import java.time.OffsetDateTime;

@Mapper(componentModel = "spring")
public interface AnubisUploadDocumentMapper {

    @Mappings({
            @Mapping(target = "uuid", source = "dociDocument.interchangeId", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE),
            @Mapping(target = "notificationData.origin", constant = "ANUBIS"),
            @Mapping(target = "notificationData.operationType", constant = "UPLOAD_DOCUMENT"),
            @Mapping(target = "abastData", ignore = true),
            @Mapping(target = "document", ignore = true)
    })
    DocumentProcessRequestType dDOCIDocumentToDocumentProcessRequestType(DOCIDocument dociDocument, Long idCiDocument);

    @AfterMapping
    default void setDocumentProcessRequest(DOCIDocument dociDocument, Long idCiDocument, @MappingTarget DocumentProcessRequestType documentProcessRequestType) {
        documentProcessRequestType.setAbastData(dDOCIDocumentToAbastDataType(dociDocument.getDocuments().getDocument().get(0), dociDocument.getDocuments().getDocument().get(0).getFiles().getFile().get(0)));
        documentProcessRequestType.setDocument(dDOCIDocumentToDocumentType(dociDocument.getDocuments().getDocument().get(0), dociDocument.getDocuments().getDocument().get(0).getFiles().getFile().get(0), idCiDocument));
    }

    @Mappings({
            @Mapping(target = "companyCode", constant = "TF"),
            @Mapping(target = "typeId", constant = "1"),
            @Mapping(target = "title", qualifiedByName = "setTitle", source = "document.documentTitle", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE),
            @Mapping(target = "mainDescription", source = "file.fileDescription"),
            @Mapping(target = "idocPadre", constant = "0"),
            @Mapping(target = "application", constant = "Anubis"),
            @Mapping(target = "user", source = "document.userCode"),
            @Mapping(target = "userRole", source = "document.userRol"),
            @Mapping(target = "documentDescription", constant = "Descripcion extra"),
            @Mapping(target = "docNumber", source = "file.fileNumber"),
            @Mapping(target = "client", source = "document.senderCode")
    })
    AbastDataType dDOCIDocumentToAbastDataType(DODocument document, DOFile file);

    @Named("setTitle")
    default String setTitle(String title) {
        return "Anubis:" + title;
    }

    @Mappings({
            @Mapping(target = "idAnubisCiDocument", source = "idCiDocument", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE),
            @Mapping(target = "locator", source = "document.messageReferenceNumber"),
            @Mapping(target = "dateLocator", ignore = true),
            @Mapping(target = "category", source = "file.fileCategory"),
            @Mapping(target = "imageName", source = "file.fileName"),
            @Mapping(target = "imageContent", source = "file.fileContent")
    })
    DocumentType dDOCIDocumentToDocumentType(DODocument document, DOFile file, Long idCiDocument);

    @AfterMapping
    default void setDocumentDate(@MappingTarget DocumentType documentType) {
        documentType.setDateLocator(OffsetDateTime.now());
    }
}
