package com.ccl.documentmanagementintapi.services;

import com.ccl.documentmanagementintapi.domain.dtos.storage.document.RequestType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.document.ResponseType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.download.DocumentResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Resource;
import java.net.URI;

@Service
@Slf4j
public class DocumentStorageServiceImpl implements DocumentStorageService {

    @Resource
    private RestTemplate restTemplate;

    @Value("${document.storage.url}")
    private String documentStorageUrl;

    private static final String PATH_DOCUMENT = "/documents";

    @Override
    public ResponseType uploadDocument(RequestType requestType) {

        HttpEntity entity = new HttpEntity(requestType);

        URI targetUrl = UriComponentsBuilder.fromUriString(documentStorageUrl)
                .path(PATH_DOCUMENT)
                .build()
                .encode()
                .toUri();

        try {
            log.debug("Upload Document Storage request body: {}", entity);
            ResponseEntity<ResponseType> responseEntity = restTemplate.postForEntity(targetUrl, entity, ResponseType.class);
            log.debug("Upload Document Storage response body: {}", responseEntity.getBody());

            return responseEntity.getBody();
        } catch (RestClientException e) {
            log.error("Upload Document Storage error exception: {}", ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    @Override
    public ResponseType deleteDocument(Integer idDocument) {
        URI targetUrl = UriComponentsBuilder.fromUriString(documentStorageUrl)
                .path(PATH_DOCUMENT)
                .queryParam("idDocument", idDocument)
                .build()
                .encode()
                .toUri();

        try {
            log.debug("Delete Document Storage request with idDocument: {}", idDocument);
            ResponseEntity<ResponseType> responseEntity = restTemplate.exchange(targetUrl, HttpMethod.DELETE, null, ResponseType.class);
            log.debug("Delete Document Storage response body: {}", responseEntity.getBody());

            return responseEntity.getBody();
        } catch (RestClientException e) {
            log.error("Delete Document Storage error exception: {}", ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    @Override
    public DocumentResponse downloadDocument(Integer idDocument) {
        URI targetUrl = UriComponentsBuilder.fromUriString(documentStorageUrl)
                .path(PATH_DOCUMENT)
                .queryParam("idDocument", idDocument)
                .build()
                .encode()
                .toUri();

        try {
            log.debug("Download Document Storage request with idDocument: {}", idDocument);
            ResponseEntity<DocumentResponse> responseEntity = restTemplate.exchange(targetUrl, HttpMethod.GET, null, DocumentResponse.class);
            if (ObjectUtils.isNotEmpty(responseEntity.getBody())) {
                log.info("Download Document Storage response code: {}", responseEntity.getBody().getCode());
            }
            log.debug("Download Document Storage response body: {}", responseEntity.getBody());

            return responseEntity.getBody();
        } catch (RestClientException e) {
            log.error("Download Document Storage error exception: {}", ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

}
