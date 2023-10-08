package com.ccl.documentmanagementintapi.mappers;

import com.ccl.documentmanagementintapi.domain.dtos.storage.document.AnexoType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.document.CabeceraRequestType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.document.RequestType;
import com.ccl.documentmanagementintapi.domain.ws.document.AbastDataType;
import com.ccl.documentmanagementintapi.domain.ws.document.DocumentProcessRequestType;
import com.ccl.documentmanagementintapi.domain.ws.document.DocumentType;
import org.mapstruct.*;

import java.math.BigDecimal;

@Mapper(componentModel = "spring")
public interface UploadDocumentMapper {

    @Mappings({
            @Mapping(target = "cabecera", ignore = true),
            @Mapping(target = "anexos", ignore = true)
    })
    RequestType dDocumentProcessRequestTypeToRequestType(DocumentProcessRequestType documentProcessRequestType);

    @AfterMapping
    default void setRequestType(DocumentProcessRequestType documentProcessRequestType, @MappingTarget RequestType requestType) {
        requestType.setCabecera(dAbastDataTypeDocumentTypeToCabeceraRequestType(documentProcessRequestType.getAbastData(), documentProcessRequestType.getDocument()));
        requestType.setAnexos(dDocumentTypeAbastDataTypeToAnexoType(documentProcessRequestType.getDocument(), documentProcessRequestType.getAbastData()));
    }

    @Mappings({
            @Mapping(target = "empresa.codigo", source = "abastDataType.companyCode"),
            @Mapping(target = "tipo.id", source = "abastDataType.typeId"),
            @Mapping(target = "titulo", source = "abastDataType.title"),
            @Mapping(target = "descripcion", source = "abastDataType.mainDescription"),
            @Mapping(target = "localizador", source = "documentType.locator"),
            @Mapping(target = "fechaDocumento", ignore = true),
            @Mapping(target = "categoria", source = "documentType.category"),
            @Mapping(target = "idocPadre", source = "abastDataType.idocPadre"),
            @Mapping(target = "aplicacion", source = "abastDataType.application"),
            @Mapping(target = "usuario", source = "abastDataType.user"),
            @Mapping(target = "rolUsuario", source = "abastDataType.userRole")
    })
    CabeceraRequestType dAbastDataTypeDocumentTypeToCabeceraRequestType(AbastDataType abastDataType, DocumentType documentType);

    @AfterMapping
    default void setDocumentDate(@MappingTarget CabeceraRequestType cabeceraRequestType) {
        cabeceraRequestType.setFechaDocumento(BigDecimal.valueOf(System.currentTimeMillis()));
    }

    @Mappings({
            @Mapping(target = "principal.nombre", source = "documentType.imageName"),
            @Mapping(target = "principal.binario", source = "documentType.imageContent"),
            @Mapping(target = "principal.descripcion", source = "abastDataType.documentDescription")
    })
    AnexoType dDocumentTypeAbastDataTypeToAnexoType(DocumentType documentType, AbastDataType abastDataType);

}
