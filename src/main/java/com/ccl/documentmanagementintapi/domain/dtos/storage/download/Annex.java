package com.ccl.documentmanagementintapi.domain.dtos.storage.download;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Annex {
    @JsonProperty("principal")
    private String principal;
    @JsonProperty("secundario")
    private String secondary;
}
