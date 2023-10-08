package com.ccl.documentmanagementintapi.services;

import com.ccl.documentmanagementintapi.domain.dtos.storage.document.ResponseType;
import com.ccl.documentmanagementintapi.domain.ws.thumbnail.ThumbnailProcessRequestType;
import com.ccl.documentmanagementintapi.mappers.ThumbnailNotificationMapper;
import com.ccl.documentmanagementintapi.mappers.UploadThumbnailMapper;
import com.ccl.documentmanagementintapi.utils.thumbnail.ThumbnailGenerator;
import com.ccl.documentmanagementintapi.utils.thumbnail.ThumbnailSize;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.image.BufferedImageOp;
import java.io.IOException;
import java.util.Optional;

@Slf4j
@Service
public class ThumbnailServiceImpl implements ThumbnailService {

    @Autowired
    private DocumentStorageService documentStorageService;

    @Autowired
    private NotificationService notificationService;

    @Resource
    private UploadThumbnailMapper uploadThumbnailMapper;

    @Resource
    private ThumbnailNotificationMapper thumbnailNotificationMapper;

    @Resource
    private Environment properties;

    @Value("${thumbnail.width:#{150}}")
    private Integer defaultWidth;

    @Value("${thumbnail.height:#{150}}")
    private Integer defaultHeight;

    @Override
    public void processThumbnail(ThumbnailProcessRequestType thumbnailProcessRequest) throws Exception {
        byte[] thumbnail = createThumbnail(thumbnailProcessRequest);

        if (thumbnail == null) {
            log.info("Impossible to create the thumbnail");

            return;
        }

        Optional<ResponseType> uploadThumbnailResponse = Optional.ofNullable(documentStorageService.uploadDocument(uploadThumbnailMapper.dThumbnailProcessRequestTypeToRequestType(thumbnail, thumbnailProcessRequest)));

        if (uploadThumbnailResponse.isPresent() && ObjectUtils.isNotEmpty(uploadThumbnailResponse) && uploadThumbnailResponse.get().getCodigo().equals("201") && StringUtils.isNotEmpty(uploadThumbnailResponse.get().getItem().getCabecera().getId().toString())) {
            log.info("Thumbnail properly stored with idScanvisio: {}", uploadThumbnailResponse.get().getItem().getCabecera().getId());

            notificationService.publishNotification(thumbnailNotificationMapper.dThumbnailProcessRequestTypeToNotificationType(uploadThumbnailResponse.get().getItem().getCabecera().getId().toString(), thumbnailProcessRequest));

        } else {
            log.error("Error storing thumbnail to Scanvisio with EXCEPTION: {}", uploadThumbnailResponse.toString());
        }

    }

    @Override
    public byte[] createThumbnail(ThumbnailProcessRequestType thumbnailProcessRequest) throws Exception {
        log.debug("Creating thumbnail");
        ThumbnailSize thumbnailSize = setThumbnailSize(thumbnailProcessRequest.getNotificationData().getOrigin().toLowerCase());
        log.trace("Thumbnail size for origin {} - width: {}, height: {}", thumbnailProcessRequest.getNotificationData().getOrigin().toLowerCase(), thumbnailSize.getWidth(), thumbnailSize.getHeight());

        ThumbnailGenerator thumbnailGenerator = new ThumbnailGenerator();
        byte[] originalBase64 = thumbnailProcessRequest.getDocument().getImageContent();
        String fileType = thumbnailProcessRequest.getDocument().getImageName().substring(thumbnailProcessRequest.getDocument().getImageName().lastIndexOf('.') + 1);
        byte[] thumbnail = null;

        thumbnail = thumbnailGenerator.generateThumbnail(originalBase64, fileType, thumbnailSize.getWidth(), thumbnailSize.getHeight());
        log.info("Thumbnail generated for original Scanvisio document id: {}", thumbnailProcessRequest.getAdditionalData().getAbastId());

        return thumbnail;
    }

    private ThumbnailSize setThumbnailSize(String origin) {
        ThumbnailSize thumbnailSize;
        Integer originWidth = NumberUtils.toInt(properties.getProperty(origin.concat(".thumbnail.width")), -1);
        Integer originHeight = NumberUtils.toInt(properties.getProperty(origin.concat(".thumbnail.height")), -1);

        if (ObjectUtils.isNotEmpty(originWidth) && originWidth > 0 && ObjectUtils.isNotEmpty(originHeight) && originHeight > 0) {
            thumbnailSize = ThumbnailSize.builder()
                    .width(originWidth)
                    .height(originHeight)
                    .build();
        } else {
            thumbnailSize = ThumbnailSize.builder()
                    .width(defaultWidth)
                    .height(defaultHeight)
                    .build();
        }

        return thumbnailSize;
    }

}
