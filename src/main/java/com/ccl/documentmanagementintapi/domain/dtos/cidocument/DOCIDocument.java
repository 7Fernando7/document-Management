package com.ccl.documentmanagementintapi.domain.dtos.cidocument;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DOCIDocument {

    @JsonProperty(value = "InterchangeId")
    protected String interchangeId;
    @JsonProperty(value = "SenderIdentification")
    protected String senderIdentification;
    @JsonProperty(value = "ReceiverIdentification")
    protected String receiverIdentification;
    @JsonProperty(value = "MsgPreparationDate")
    protected Date msgPreparationDate;
    @JsonProperty(value = "XSDVersion")
    protected String xsdVersion;
    @JsonProperty(value = "ACKOfReceipt")
    protected String ackOfReceipt;
    @JsonProperty(value = "TestIndicator")
    protected String testIndicator;
    @JsonProperty(value = "CorrelationId")
    protected String correlationId;
    @JsonProperty(value = "QuantityDoc")
    protected BigDecimal quantityDoc;
    @JsonProperty(value = "Documents")
    protected DOCIDocument.Documents documents;

    @Data
    public static class Documents {

        @JsonProperty(value = "Document")
        protected List<DODocument> document;
    }

}
