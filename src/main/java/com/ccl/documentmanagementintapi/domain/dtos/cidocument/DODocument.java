package com.ccl.documentmanagementintapi.domain.dtos.cidocument;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DODocument {

    @JsonProperty(value = "SenderCode")
    protected String senderCode;
    @JsonProperty(value = "ReceiverCode")
    protected String receiverCode;
    @JsonProperty(value = "MessageReferenceNumber")
    protected String messageReferenceNumber;
    @JsonProperty(value = "MessageType")
    protected String messageType;
    @JsonProperty(value = "MessageSubtype")
    protected String messageSubtype;
    @JsonProperty(value = "EntityCode")
    protected String entityCode;
    @JsonProperty(value = "DocumentTitle")
    protected String documentTitle;
    @JsonProperty(value = "DocumentDescription")
    protected String documentDescription;
    @JsonProperty(value = "CustomerCode")
    protected String customerCode;
    @JsonProperty(value = "DocumentDate")
    protected String documentDate;
    @JsonProperty(value = "UserCode")
    protected String userCode;
    @JsonProperty(value = "UserRol")
    protected String userRol;
    @JsonProperty(value = "Files")
    protected DODocument.Files files;

    @Data
    public static class Files {

        @JsonProperty(value = "File")
        protected List<DOFile> file;
    }

}
