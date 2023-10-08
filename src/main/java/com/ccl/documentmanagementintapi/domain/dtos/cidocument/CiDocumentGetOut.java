package com.ccl.documentmanagementintapi.domain.dtos.cidocument;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CiDocumentGetOut {
    @JsonProperty(value = "resultCode")
    private Integer resultCode;

    @JsonProperty(value = "CIDocument")
    private DOCIDocument dociDocument;

    @JsonProperty(value = "resultDescription")
    private String resultDescription;
}

