package com.vaibhav.notification.controllers;

import com.vaibhav.notification.data.Notification;
import com.vaibhav.notification.domain.NotificationDo;
import com.vaibhav.notification.services.NotificationService;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotificationController {

    private final static String NOTIFICATION = "/notifications";

    private NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @ApiOperation(value = "Retrive all Notification")
    @RequestMapping(path = NOTIFICATION, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Notification> getNotification() {
        return notificationService.findAllNotifications();
    }


    @ApiOperation(value = "Post new Notification")
    @RequestMapping(path = NOTIFICATION, method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Notification addNotification(@RequestBody NotificationDo request) {
        if (request != null) {
            return notificationService.addNotification(request);
        }
        return null;
    }
}
