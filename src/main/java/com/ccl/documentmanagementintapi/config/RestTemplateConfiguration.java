package com.ccl.documentmanagementintapi.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Slf4j
@Configuration
public class RestTemplateConfiguration {

    @Value("${connect.timeout.ms}")
    private Duration connectTimeout;

    @Value("${read.timeout.ms}")
    private Duration readTimeout;

    @Bean
    RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.setConnectTimeout(connectTimeout).setReadTimeout(readTimeout).build();
    }

}
