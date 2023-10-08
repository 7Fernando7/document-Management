package com.ccl.documentmanagementintapi.domain.dtos.storage.download;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Header {
    @JsonProperty("nombreFichero")
    private String fileName;
    @JsonProperty("binario")
    private String binary;
}
