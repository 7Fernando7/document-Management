package com.ccl.documentmanagementintapi.mappers;

import com.ccl.documentmanagementintapi.domain.dtos.notification.NotificationType;
import com.ccl.documentmanagementintapi.domain.dtos.notification.PropertyType;
import com.ccl.documentmanagementintapi.domain.dtos.notification.document.upload.UploadDocumentNotificationType;
import com.ccl.documentmanagementintapi.domain.ws.document.DocumentProcessRequestType;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.*;

import java.time.OffsetDateTime;

@Mapper(componentModel = "spring")
public interface UploadDocumentNotificationMapper {

    @Mappings({
            @Mapping(target = "properties", ignore = true),
            @Mapping(target = "content", ignore = true)
    })
    NotificationType dDocumentProcessRequestTypeToNotificationType(String idScanvisio, String scanvisioDsError, DocumentProcessRequestType documentProcessRequestType);

    @AfterMapping
    default void setProperties(DocumentProcessRequestType documentProcessRequestType, @MappingTarget NotificationType notification) {
        NotificationType.Properties properties = new NotificationType.Properties();

        PropertyType originProperty = new PropertyType();
        originProperty.setName("origin");
        originProperty.setValue(documentProcessRequestType.getNotificationData().getOrigin());
        properties.getProperty().add(originProperty);

        PropertyType typeProperty = new PropertyType();
        typeProperty.setName("type");
        typeProperty.setValue(documentProcessRequestType.getNotificationData().getOperationType());
        properties.getProperty().add(typeProperty);

        PropertyType uuidProperty = new PropertyType();
        uuidProperty.setName("uuid");
        uuidProperty.setValue(documentProcessRequestType.getUuid());
        properties.getProperty().add(uuidProperty);

        if ((ObjectUtils.isNotEmpty(documentProcessRequestType.getDocument().getIdAnubisCiDocument())) && (StringUtils.isNotEmpty(documentProcessRequestType.getDocument().getIdAnubisCiDocument().toString()))) {
            PropertyType idCiDocumentProperty = new PropertyType();
            idCiDocumentProperty.setName("idAnubisCiDocument");
            idCiDocumentProperty.setValue(documentProcessRequestType.getDocument().getIdAnubisCiDocument().toString());
            properties.getProperty().add(idCiDocumentProperty);
        }

        notification.setProperties(properties);
    }

    @AfterMapping
    default void setContent(String idScanvisio, String scanvisioDsError, DocumentProcessRequestType documentProcessRequestType, @MappingTarget NotificationType notification) {
        notification.setContent(dNotificationTypeToUploadDocumentNotificationType(idScanvisio, scanvisioDsError, documentProcessRequestType));
    }

    @Mappings({
            @Mapping(target = "abastDocumentId", source = "idScanvisio"),
            @Mapping(target = "abastDsError", source = "scanvisioDsError", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE),
            @Mapping(target = "documentInfo.locator", source = "documentProcessRequestType.document.locator"),
            @Mapping(target = "documentInfo.dateTime", ignore = true),
            @Mapping(target = "documentInfo.deliveryStatus", source = "documentProcessRequestType.document.deliveryStatus"),
            @Mapping(target = "documentInfo.description", source = "documentProcessRequestType.abastData.mainDescription"),
            @Mapping(target = "documentInfo.fileComments", source = "documentProcessRequestType.document.comments"),
            @Mapping(target = "documentInfo.fileName", source = "documentProcessRequestType.document.imageName"),
            @Mapping(target = "documentInfo.category", source = "documentProcessRequestType.document.category"),
            @Mapping(target = "documentInfo.coordinates.latitude", source = "documentProcessRequestType.document.gpsCoordinates.latitude"),
            @Mapping(target = "documentInfo.coordinates.longitude", source = "documentProcessRequestType.document.gpsCoordinates.longitude"),
            @Mapping(target = "documentInfo.deviceInfo.IMEI", source = "documentProcessRequestType.document.infoDevice.imei"),
            @Mapping(target = "documentInfo.deviceInfo.deviceId", source = "documentProcessRequestType.document.infoDevice.deviceId"),
            @Mapping(target = "documentInfo.deviceInfo.MAC", source = "documentProcessRequestType.document.infoDevice.mac"),
            @Mapping(target = "documentInfo.deviceInfo.deviceOS", source = "documentProcessRequestType.document.infoDevice.deviceSO"),
            @Mapping(target = "documentInfo.deviceInfo.appVersion", source = "documentProcessRequestType.document.infoDevice.appVersion"),
            @Mapping(target = "documentInfo.documentTitle", source = "documentProcessRequestType.abastData.title"),
            @Mapping(target = "documentInfo.idocPadre", source = "documentProcessRequestType.abastData.idocPadre"),
            @Mapping(target = "documentInfo.user", source = "documentProcessRequestType.abastData.user"),
            @Mapping(target = "documentInfo.userRol", source = "documentProcessRequestType.abastData.userRole"),
            @Mapping(target = "documentInfo.client", source = "documentProcessRequestType.abastData.client"),
            @Mapping(target = "documentInfo.docNumber", source = "documentProcessRequestType.abastData.docNumber")
    })
    UploadDocumentNotificationType dNotificationTypeToUploadDocumentNotificationType(String idScanvisio, String scanvisioDsError, DocumentProcessRequestType documentProcessRequestType);

    @AfterMapping
    default void setDocumentDate(@MappingTarget UploadDocumentNotificationType uploadDocumentNotification) {
        uploadDocumentNotification.getDocumentInfo().setDateTime(OffsetDateTime.now());
    }
}
