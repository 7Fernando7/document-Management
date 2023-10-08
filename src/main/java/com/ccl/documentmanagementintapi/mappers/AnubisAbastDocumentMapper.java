package com.ccl.documentmanagementintapi.mappers;

import com.ccl.documentmanagementintapi.domain.dtos.storage.document.RequestType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.download.DocumentResponse;
import com.ccl.documentmanagementintapi.domain.ws.anubisabastdocument.RequestUploadType;
import com.ccl.documentmanagementintapi.domain.ws.anubisabastdocument.ResponseType;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.math.BigDecimal;
import java.util.Arrays;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface AnubisAbastDocumentMapper {

    @Mappings({
            @Mapping(target = "codigo", source = "documentResponse.code"),
            @Mapping(target = "fileName", ignore = true),
            @Mapping(target = "fileContent", ignore = true)
    })
    ResponseType convertDocumentResponseToResponseType(DocumentResponse documentResponse);

    @AfterMapping
    default void afterConvertDocumentResponseToResponseType(DocumentResponse documentResponse, @MappingTarget ResponseType responseType) {
        if (documentResponse.getItem().getHeaders() != null && !documentResponse.getItem().getHeaders().isEmpty()) {
            responseType.setFileName(documentResponse.getItem().getHeaders().get(0).getFileName());
            responseType.setFileContent(documentResponse.getItem().getHeaders().get(0).getBinary());
        }
    }

    @Mappings({
            @Mapping(target = "codigo", source = "responseTypeScanvisio.codigo"),
            @Mapping(target = "ID", ignore = true),
            @Mapping(target = "fileName", ignore = true),
            @Mapping(target = "fileContent", ignore = true)
    })
    ResponseType convertResponseTypeScanvisioToResponseType(com.ccl.documentmanagementintapi.domain.dtos.storage.document.ResponseType responseTypeScanvisio);

    @AfterMapping
    default void afterConvertResponseTypeScanvisioToResponseType(com.ccl.documentmanagementintapi.domain.dtos.storage.document.ResponseType responseTypeScanvisio, @MappingTarget ResponseType responseType) {
        if (responseTypeScanvisio.getItem().getCabecera() != null) {
            responseType.setID((Integer) responseTypeScanvisio.getItem().getCabecera().getId());
            responseType.setFileName(responseTypeScanvisio.getItem().getCabecera().getNombreFichero());
            responseType.setFileContent(Arrays.toString(responseTypeScanvisio.getItem().getCabecera().getBinario()));
        }
    }

    @Mappings({
            @Mapping(target = "cabecera.titulo", source = "requestUploadType.titulo"),
            @Mapping(target = "cabecera.descripcion", source = "requestUploadType.descripcion"),
            @Mapping(target = "cabecera.fechaDocumento", source = "requestUploadType.fechaDocMilis", qualifiedByName = "convertLongToBigDecimal"),
            @Mapping(target = "cabecera.categoria", source = "requestUploadType.categoria"),
            @Mapping(target = "cabecera.idocPadre", source = "requestUploadType.idocPadre", qualifiedByName = "convertIntToBigDecimal"),
            @Mapping(target = "cabecera.usuario", source = "requestUploadType.usuario"),
            @Mapping(target = "cabecera.rolUsuario", source = "requestUploadType.rolUsuario"),
            @Mapping(target = "cabecera.localizador", source = "requestUploadType.localizador"),
            @Mapping(target = "cabecera.cliente", source = "requestUploadType.cliente"),
            @Mapping(target = "cabecera.numeroDocumento", source = "requestUploadType.numeroDocumento"),
            @Mapping(target = "anexos.principal.nombre", source = "requestUploadType.nombreFichero"),
            @Mapping(target = "anexos.principal.binario", source = "requestUploadType.binario")
    })
    RequestType convertRequestUploadTypeToRequestType(RequestUploadType requestUploadType);

    @Named("convertLongToBigDecimal")
    default BigDecimal convertLongToBigDecimal(Long data) {
        if (data != null) {
            return BigDecimal.valueOf(data);
        }
        return null;
    }

    @Named("convertIntToBigDecimal")
    default BigDecimal convertIntToBigDecimal(Integer data) {
        if (data != null) {
            return BigDecimal.valueOf(data);
        }
        return null;
    }

}
