package com.ccl.documentmanagementintapi.mappers;

import com.ccl.documentmanagementintapi.domain.dtos.storage.document.EmpresaType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.document.RequestType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.document.TipoType;
import com.ccl.documentmanagementintapi.domain.ws.anubisabastdocument.RequestUploadType;
import com.ccl.documentmanagementintapi.domain.ws.anubisabastdocument.ResponseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DefaultDocumentMapper implements DocumentMapper {

    @Value("${document.management.anubis-request.empresa.codigo}")
    private String empresaCodigoRequest;

    @Value("${document.management.anubis-request.tipo}")
    private Integer tipoRequest;

    @Value("${document.management.anubis-request.aplicacion}")
    private String aplicacionRequest;

    @Autowired
    private AnubisAbastDocumentMapper anubisAbastDocumentMapper;

    @Override
    public RequestType convertRequestUploadTypeToRequestType(RequestUploadType requestUploadType) {
        RequestType requestType = anubisAbastDocumentMapper.convertRequestUploadTypeToRequestType(requestUploadType);
        if (requestType != null && requestType.getCabecera() != null) {
            requestType.getCabecera().setAplicacion(aplicacionRequest);
            requestType.getCabecera().setEmpresa(empresaTypeBuild());
            requestType.getCabecera().setTipo(tipoTypeBuild());
        }

        return requestType;
    }

    @Override
    public ResponseType documentResponseMapper(com.ccl.documentmanagementintapi.domain.dtos.storage.document.ResponseType responseTypeScanvisio) {
        ResponseType responseType = anubisAbastDocumentMapper.convertResponseTypeScanvisioToResponseType(responseTypeScanvisio);
        ResponseType responseTypeDefinitive = new ResponseType();
        responseTypeDefinitive.setID(responseType.getID());
        responseTypeDefinitive.setCodigo(responseType.getCodigo());

        return responseTypeDefinitive;
    }

    private EmpresaType empresaTypeBuild() {
        EmpresaType empresaType = new EmpresaType();
        empresaType.setCodigo(empresaCodigoRequest);

        return empresaType;
    }

    private TipoType tipoTypeBuild() {
        TipoType tipoType = new TipoType();
        tipoType.setId(BigDecimal.valueOf(tipoRequest));

        return tipoType;
    }
}
