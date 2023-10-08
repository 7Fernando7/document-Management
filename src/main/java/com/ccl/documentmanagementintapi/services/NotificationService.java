package com.ccl.documentmanagementintapi.services;

import com.ccl.documentmanagementintapi.domain.dtos.notification.NotificationType;

public interface NotificationService {

    void publishNotification(NotificationType notification);

}
