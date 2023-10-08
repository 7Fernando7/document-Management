package com.ccl.documentmanagementintapi.services;

import com.ccl.documentmanagementintapi.domain.dtos.storage.document.RequestType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.document.ResponseType;
import com.ccl.documentmanagementintapi.domain.dtos.storage.download.DocumentResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Slf4j
@Service
public class ScanvisioServiceImpl implements ScanvisioService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${scanvisio.document.service.url}")
    private String scanvisioDocumentServiceUrl;

    private static final String pathDocument = "/documents";

    @Override
    public ResponseType uploadDocument(RequestType requestType) {

        HttpEntity entity = new HttpEntity(requestType);

        URI targetUrl = UriComponentsBuilder.fromUriString(scanvisioDocumentServiceUrl)
                .path(pathDocument)
                .build()
                .encode()
                .toUri();

        try {
            log.debug("Scanvisio Upload Document request body: {}", entity);
            ResponseEntity<ResponseType> responseEntity = restTemplate.postForEntity(targetUrl, entity, ResponseType.class);
            log.debug("Scanvisio Upload Document response body: {}", responseEntity.getBody());

            return responseEntity.getBody();
        } catch (RestClientException rce) {
            log.error("Scanvisio Upload Document error exception: {}", ExceptionUtils.getStackTrace(rce));
            throw rce;
        }
    }

    @Override
    public ResponseType deleteDocument(Integer idScanvisio) {
        URI targetUrl = UriComponentsBuilder.fromUriString(scanvisioDocumentServiceUrl)
                .path(pathDocument + "/" + idScanvisio)
                .build()
                .encode()
                .toUri();

        try {
            log.debug("Scanvisio Delete Document request with idScanvisio: {}", idScanvisio);
            ResponseEntity<ResponseType> responseEntity = restTemplate.exchange(targetUrl, HttpMethod.DELETE, null, ResponseType.class);
            log.debug("Scanvisio Delete Document response body: {}", responseEntity.getBody());

            return responseEntity.getBody();
        } catch (RestClientException rce) {
            log.error("Scanvisio Delete Document error exception: {}", ExceptionUtils.getStackTrace(rce));
            throw rce;
        }
    }

    @Override
    public DocumentResponse downloadDocument(Integer idScanvisio) {
        URI targetUrl = UriComponentsBuilder.fromUriString(scanvisioDocumentServiceUrl)
                .path(pathDocument + "/" + idScanvisio)
                .build()
                .encode()
                .toUri();

        try {
            log.debug("Scanvisio Download Document request with idScanvisio: {}", idScanvisio);
            ResponseEntity<DocumentResponse> responseEntity = restTemplate.exchange(targetUrl, HttpMethod.GET, null, DocumentResponse.class);
            if (ObjectUtils.isNotEmpty(responseEntity.getBody())) {
                log.info("Scanvisio Download Document response code: {}", responseEntity.getBody().getCode());
            }
            log.debug("Scanvisio Download Document response body: {}", responseEntity.getBody());

            return responseEntity.getBody();
        } catch (RestClientException rce) {
            log.error("Scanvisio Download Document error exception: {}", ExceptionUtils.getStackTrace(rce));
            throw rce;
        }
    }

}
