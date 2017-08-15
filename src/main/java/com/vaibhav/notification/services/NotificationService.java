package com.vaibhav.notification.services;

import com.vaibhav.notification.data.Notification;
import com.vaibhav.notification.data.transformer.NotificationTransformer;
import com.vaibhav.notification.domain.NotificationDo;
import com.vaibhav.notification.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class NotificationService {

    private NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> findAllNotifications() {
        return notificationRepository.findAll();

    }

    public Notification addNotification(NotificationDo request) {
        if (request != null) {
            request.setId(UUID.randomUUID());
            request.setCreateTimeStamp(new Date().toString());
            return notificationRepository.save(NotificationTransformer.transform(request));
        }
        return null;
    }
}
