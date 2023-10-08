package com.ccl.documentmanagementintapi.services;

import com.ccl.documentmanagementintapi.domain.ws.thumbnail.ThumbnailProcessRequestType;

public interface ThumbnailService  {

    void processThumbnail(ThumbnailProcessRequestType thumbnailProcessRequest) throws Exception;

    byte[] createThumbnail(ThumbnailProcessRequestType thumbnailProcessRequest) throws Exception;

}
