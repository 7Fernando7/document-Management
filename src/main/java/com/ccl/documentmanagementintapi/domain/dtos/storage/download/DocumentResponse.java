package com.ccl.documentmanagementintapi.domain.dtos.storage.download;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DocumentResponse {
    @JsonProperty("codigo")
    private String code;
    @JsonProperty("item")
    private Item item;
}
