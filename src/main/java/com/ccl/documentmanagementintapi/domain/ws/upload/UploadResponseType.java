package com.ccl.documentmanagementintapi.domain.ws.upload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class UploadResponseType {

    private String cdError;
    private String id;
    private String dsError;
}
