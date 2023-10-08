package com.ccl.documentmanagementintapi.messages;

import com.ccl.documentmanagementintapi.domain.dtos.notification.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class NotificationKafkaProducer {

    @Value("${document.kafka.notification.out.topic}")
    private String notificatinOutTopic;

    @Resource
    private KafkaTemplate<String, NotificationType> notificationOutKafkaTemplate;

    public void sendNotificationOutMessage(NotificationType message) {
        log.debug("Producing message to Topic: {}  Message: {}", notificatinOutTopic, message);

        notificationOutKafkaTemplate.setDefaultTopic(notificatinOutTopic);

        this.notificationOutKafkaTemplate.send(notificatinOutTopic, message);
    }

}
