package com.ccl.documentmanagementintapi;

import com.ccl.architecture.elasticsearch.logger.annotations.EnableElasticSearchLogger;
import com.ccl.architecture.elasticsearch.logger.annotations.EnableRequestLogger;
import com.ccl.architecture.jdbc.EnableJdbcRepositories;
import com.ccl.architecture.tracing.annotations.EnableTracing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableRequestLogger
@EnableElasticSearchLogger
@EnableJdbcRepositories
@EnableTracing
@EnableAsync
public class DocumentManagementIntApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DocumentManagementIntApiApplication.class, args);
    }

}
