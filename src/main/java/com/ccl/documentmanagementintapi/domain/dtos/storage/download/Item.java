package com.ccl.documentmanagementintapi.domain.dtos.storage.download;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Item {
    @JsonProperty("cabecera")
    private List<Header> headers;
    @JsonProperty("anexos")
    private Annex annexes;
}
