package com.ccl.documentmanagementintapi.services;

import com.ccl.documentmanagementintapi.domain.dtos.cidocument.CiDocumentGetOut;
import lombok.NonNull;

public interface CiDocumentService {

    CiDocumentGetOut getCiDocumentInformation(@NonNull Long idCiDocument);

}
