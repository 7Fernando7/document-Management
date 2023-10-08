package com.ccl.documentmanagementintapi.services;

import com.ccl.documentmanagementintapi.domain.dtos.notification.NotificationType;
import com.ccl.documentmanagementintapi.messages.NotificationKafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class NotificationServiceImpl implements NotificationService {

    @Resource
    private NotificationKafkaProducer kafkaProducer;

    @Async
    @Override
    public void publishNotification(NotificationType notification) {

        try {
            log.debug("Notification request body: {}", notification);
            kafkaProducer.sendNotificationOutMessage(notification);
            log.info("Notification sent");
        } catch (Exception e) {
            log.error("Notification error exception: {}", ExceptionUtils.getStackTrace(e));
        }

    }
}
