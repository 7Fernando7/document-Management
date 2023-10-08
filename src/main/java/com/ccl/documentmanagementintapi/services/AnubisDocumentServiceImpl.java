package com.ccl.documentmanagementintapi.services;

import com.ccl.architecture.tracing.annotations.Trace;
import com.ccl.documentmanagementintapi.domain.dtos.cidocument.CiDocumentGetOut;
import com.ccl.documentmanagementintapi.domain.dtos.cidocument.DOCIDocument;
import com.ccl.documentmanagementintapi.mappers.AnubisDeleteDocumentMapper;
import com.ccl.documentmanagementintapi.mappers.AnubisUploadDocumentMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class AnubisDocumentServiceImpl implements AnubisDocumentService {

    @Resource
    private DocumentManagementService documentManagementService;

    @Resource
    private CiDocumentService ciDocumentService;

    @Resource
    private AnubisUploadDocumentMapper anubisUploadDocumentMapper;

    @Resource
    private AnubisDeleteDocumentMapper anubisDeleteDocumentMapper;

    @Override
    @Trace(operation = "Process document", newCorrelationId = true)
    public void anubisUploadDocument(Long idCiDocument) {
        CiDocumentGetOut ciDocument = ciDocumentService.getCiDocumentInformation(idCiDocument);
        DOCIDocument document = ciDocument.getDociDocument();

        if (ObjectUtils.isNotEmpty(document.getDocuments().getDocument().get(0).getFiles().getFile().get(0).getFileContent()))
            documentManagementService.processUploadDocument(anubisUploadDocumentMapper.dDOCIDocumentToDocumentProcessRequestType(document, idCiDocument), true);
        else
            log.error("Error in upload document service because the anubis document is empty or null, ID_CI_DOCUMENT = {}", idCiDocument);
    }

    @Override
    @Trace(operation = "Delete document", newCorrelationId = true)
    public void anubisDeleteDocument(Long idCiDocument) {
        CiDocumentGetOut ciDocument = ciDocumentService.getCiDocumentInformation(idCiDocument);
        DOCIDocument document = ciDocument.getDociDocument();

        documentManagementService.processDeleteDocument(anubisDeleteDocumentMapper.dDOCIDocumentToDocumentProcessRequestType(document, idCiDocument));
    }

}
