package com.ccl.documentmanagementintapi.services;

import com.ccl.documentmanagementintapi.domain.dtos.cidocument.CiDocumentGetOut;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Slf4j
@Service
public class CiDocumentServiceImpl implements CiDocumentService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${ci.document.service.url}")
    private String ciDocumentServiceUrl;

    public CiDocumentGetOut getCiDocumentInformation(@NonNull Long idCiDocument) {
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        HttpEntity entity = new HttpEntity(headers);

        URI targetUrl = UriComponentsBuilder.fromUriString(ciDocumentServiceUrl)
                .path("/CI_DOCUMENT_OUT/OU_DO_CI_DOCUMENT")
                .queryParam("NID_CI_DOCUMENT", idCiDocument.intValue())
                .build()
                .encode()
                .toUri();

        try {
            log.debug("CI request to fetch data for idCiDocument: {}", idCiDocument);
            ResponseEntity<CiDocumentGetOut> responseEntity = restTemplate.exchange(targetUrl, HttpMethod.GET, entity, CiDocumentGetOut.class);
            log.debug("CI response body: {}", responseEntity.getBody());

            return responseEntity.getBody();
        } catch (RestClientException rce) {
            log.error("CI error response: {}", ExceptionUtils.getStackTrace(rce));

            return null;
        }
    }

}
