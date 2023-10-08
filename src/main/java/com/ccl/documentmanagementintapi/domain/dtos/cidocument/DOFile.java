package com.ccl.documentmanagementintapi.domain.dtos.cidocument;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DOFile {

    @JsonProperty(value = "FileNumber")
    protected String fileNumber;
    @JsonProperty(value = "FileDate")
    protected String fileDate;
    @JsonProperty(value = "FileCategory")
    protected String fileCategory;
    @JsonProperty(value = "DocumentReference")
    protected String documentReference;
    @JsonProperty(value = "FileName")
    protected String fileName;
    @JsonProperty(value = "FileDescription")
    protected String fileDescription;
    @JsonProperty(value = "FileContent")
    protected byte[] fileContent;
    @JsonProperty(value = "FileLatitude")
    protected String fileLatitude;
    @JsonProperty(value = "FileLongitude")
    protected String fileLongitude;
    @JsonProperty(value = "EF_DeliveryStatus")
    protected String efDeliveryStatus;
    @JsonProperty(value = "EF_Comments")
    protected String efComments;
    @JsonProperty(value = "EF_IMEI")
    protected String efimei;
    @JsonProperty(value = "EF_DeviceID")
    protected String efDeviceID;
    @JsonProperty(value = "EF_MAC")
    protected String efmac;
    @JsonProperty(value = "EF_DeviceSO")
    protected String efDeviceSO;
    @JsonProperty(value = "EF_AppVersion")
    protected String efAppVersion;
    @JsonProperty(value = "InternalDocumentNumber")
    protected String internalDocumentNumber;

}
