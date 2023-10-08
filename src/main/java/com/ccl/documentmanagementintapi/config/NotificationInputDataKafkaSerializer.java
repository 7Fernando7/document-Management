package com.ccl.documentmanagementintapi.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

@Slf4j
public class NotificationInputDataKafkaSerializer implements Serializer {

    @Override
    public void configure(Map configs, boolean isKey) {

    }

    @Override
    public byte[] serialize(String s, Object o) {
        byte[] bytes = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.registerModule(new JavaTimeModule());
            objectMapper.findAndRegisterModules();
            objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            bytes = objectMapper.writeValueAsString(o).getBytes();
        } catch (Exception e) {
            log.error("Error serializing object: {}", ExceptionUtils.getStackTrace(e));
        }
        return bytes;
    }

    @Override
    public void close() {

    }

}
