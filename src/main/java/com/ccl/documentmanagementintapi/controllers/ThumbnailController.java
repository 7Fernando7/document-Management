package com.ccl.documentmanagementintapi.controllers;

import com.ccl.architecture.tracing.annotations.Trace;
import com.ccl.documentmanagementintapi.domain.ws.thumbnail.ThumbnailProcessRequestType;
import com.ccl.documentmanagementintapi.services.ThumbnailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@Slf4j
@RestController
@ConditionalOnProperty(prefix = "controller.status", name = "active", matchIfMissing = false)
@RequestMapping("/thumbnail")
public class ThumbnailController {

    @Resource
    private ThumbnailService thumbnailService;

    @Trace(operation = "Create thumbnail")
    @PostMapping()
    public byte[] createThumbnail(@Valid @RequestBody ThumbnailProcessRequestType thumbnailProcessRequest) {
        byte[] file = null;
        try {
            log.debug("Thumbnail entrance request: {}", thumbnailProcessRequest);
            file = thumbnailService.createThumbnail(thumbnailProcessRequest);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
        return file;
    }

}
