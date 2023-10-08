package com.ccl.documentmanagementintapi.mappers;

import com.ccl.documentmanagementintapi.domain.dtos.notification.NotificationType;
import com.ccl.documentmanagementintapi.domain.dtos.notification.PropertyType;
import com.ccl.documentmanagementintapi.domain.dtos.notification.document.upload.UploadDocumentNotificationType;
import com.ccl.documentmanagementintapi.domain.ws.thumbnail.ThumbnailProcessRequestType;
import org.mapstruct.*;

import java.time.OffsetDateTime;

@Mapper(componentModel = "spring")
public interface ThumbnailNotificationMapper {

    @Mappings({
            @Mapping(target = "properties", ignore = true),
            @Mapping(target = "content", ignore = true)
    })
    NotificationType dThumbnailProcessRequestTypeToNotificationType(String idScanvisio, ThumbnailProcessRequestType thumbnailProcessRequestType);

    @AfterMapping
    default void setProperties(ThumbnailProcessRequestType thumbnailProcessRequestType, @MappingTarget NotificationType notification) {
        NotificationType.Properties properties = new NotificationType.Properties();

        PropertyType originProperty = new PropertyType();
        originProperty.setName("origin");
        originProperty.setValue(thumbnailProcessRequestType.getNotificationData().getOrigin());
        properties.getProperty().add(originProperty);

        PropertyType typeProperty = new PropertyType();
        typeProperty.setName("type");
        typeProperty.setValue(thumbnailProcessRequestType.getNotificationData().getOperationType());
        properties.getProperty().add(typeProperty);

        PropertyType uuidProperty = new PropertyType();
        uuidProperty.setName("uuid");
        uuidProperty.setValue(thumbnailProcessRequestType.getUuid());
        properties.getProperty().add(uuidProperty);

        PropertyType originalImageScanvisioIdProperty = new PropertyType();
        originalImageScanvisioIdProperty.setName("originalImageScanvisioId");
        originalImageScanvisioIdProperty.setValue(String.valueOf(thumbnailProcessRequestType.getAdditionalData().getAbastId()));
        properties.getProperty().add(originalImageScanvisioIdProperty);

        notification.setProperties(properties);
    }

    @AfterMapping
    default void setContent(String idScanvisio, ThumbnailProcessRequestType thumbnailProcessRequestType, @MappingTarget NotificationType notification) {
        notification.setContent(dNotificationTypeToUploadDocumentNotificationType(idScanvisio, thumbnailProcessRequestType));
    }

    @Mappings({
            @Mapping(target = "abastDocumentId", source = "idScanvisio"),
            @Mapping(target = "documentInfo.locator", source = "thumbnailProcessRequestType.document.locator"),
            @Mapping(target = "documentInfo.dateTime", ignore = true),
            @Mapping(target = "documentInfo.deliveryStatus", source = "thumbnailProcessRequestType.document.deliveryStatus"),
            @Mapping(target = "documentInfo.description", source = "thumbnailProcessRequestType.abastData.mainDescription"),
            @Mapping(target = "documentInfo.fileComments", source = "thumbnailProcessRequestType.document.comments"),
            @Mapping(target = "documentInfo.fileName", source = "thumbnailProcessRequestType.document.imageName"),
            @Mapping(target = "documentInfo.category", source = "thumbnailProcessRequestType.document.category"),
            @Mapping(target = "documentInfo.coordinates.latitude", source = "thumbnailProcessRequestType.document.gpsCoordinates.latitude"),
            @Mapping(target = "documentInfo.coordinates.longitude", source = "thumbnailProcessRequestType.document.gpsCoordinates.longitude"),
            @Mapping(target = "documentInfo.deviceInfo.IMEI", source = "thumbnailProcessRequestType.document.infoDevice.imei"),
            @Mapping(target = "documentInfo.deviceInfo.deviceId", source = "thumbnailProcessRequestType.document.infoDevice.deviceId"),
            @Mapping(target = "documentInfo.deviceInfo.MAC", source = "thumbnailProcessRequestType.document.infoDevice.mac"),
            @Mapping(target = "documentInfo.deviceInfo.deviceOS", source = "thumbnailProcessRequestType.document.infoDevice.deviceSO"),
            @Mapping(target = "documentInfo.deviceInfo.appVersion", source = "thumbnailProcessRequestType.document.infoDevice.appVersion"),
            @Mapping(target = "documentInfo.documentTitle", source = "thumbnailProcessRequestType.abastData.title"),
            @Mapping(target = "documentInfo.idocPadre", source = "thumbnailProcessRequestType.abastData.idocPadre"),
            @Mapping(target = "documentInfo.user", source = "thumbnailProcessRequestType.abastData.user"),
            @Mapping(target = "documentInfo.userRol", source = "thumbnailProcessRequestType.abastData.userRole"),
            @Mapping(target = "documentInfo.client", source = "thumbnailProcessRequestType.abastData.client"),
            @Mapping(target = "documentInfo.docNumber", source = "thumbnailProcessRequestType.abastData.docNumber")
    })
    UploadDocumentNotificationType dNotificationTypeToUploadDocumentNotificationType(String idScanvisio, ThumbnailProcessRequestType thumbnailProcessRequestType);

    @AfterMapping
    default void setDocumentDate(@MappingTarget UploadDocumentNotificationType uploadDocumentNotification) {
        uploadDocumentNotification.getDocumentInfo().setDateTime(OffsetDateTime.now());
    }
}
