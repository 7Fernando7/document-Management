package com.ccl.documentmanagementintapi.mappers;

import com.ccl.documentmanagementintapi.domain.dtos.storage.document.AnexoType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.document.CabeceraRequestType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.document.RequestType;
import com.ccl.documentmanagementintapi.domain.ws.thumbnail.AbastDataType;
import com.ccl.documentmanagementintapi.domain.ws.thumbnail.DocumentType;
import com.ccl.documentmanagementintapi.domain.ws.thumbnail.ThumbnailProcessRequestType;
import org.mapstruct.*;

import java.math.BigDecimal;

@Mapper(componentModel = "spring")
public interface UploadThumbnailMapper {

    @Mappings({
            @Mapping(target = "cabecera", ignore = true),
            @Mapping(target = "anexos", ignore = true)
    })
    RequestType dThumbnailProcessRequestTypeToRequestType(Object thumbnail, ThumbnailProcessRequestType thumbnailProcessRequestType);

    @AfterMapping
    default void setRequestType(ThumbnailProcessRequestType thumbnailProcessRequestType, Object thumbnail, @MappingTarget RequestType requestType) {
        requestType.setCabecera(dAbastDataTypeDocumentTypeToCabeceraRequestType(thumbnailProcessRequestType.getAbastData(), thumbnailProcessRequestType.getDocument()));
        requestType.setAnexos(dDocumentTypeAbastDataTypeToAnexoType(thumbnailProcessRequestType.getDocument(), thumbnailProcessRequestType.getAbastData(), thumbnail));
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
    default void setDocumentDate(AbastDataType abastDataType, @MappingTarget CabeceraRequestType cabeceraRequestType) {
        cabeceraRequestType.setFechaDocumento(BigDecimal.valueOf(System.currentTimeMillis()));
    }

    @Mappings({
            @Mapping(target = "principal.nombre", source = "documentType.imageName"),
            @Mapping(target = "principal.binario", ignore = true),
            @Mapping(target = "principal.descripcion", source = "abastDataType.documentDescription")
    })
    AnexoType dDocumentTypeAbastDataTypeToAnexoType(DocumentType documentType, AbastDataType abastDataType, Object thumbnail);

    @AfterMapping
    default void setBinary(Object thumbnail, @MappingTarget AnexoType anexoType) {
        anexoType.getPrincipal().setBinario((byte[]) thumbnail);
    }
}
