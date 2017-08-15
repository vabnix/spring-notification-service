package com.vaibhav.notification.domain;

import java.util.List;

public class Notifications {

    private List<NotificationDo> notificationList;

    public List<NotificationDo> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<NotificationDo> notificationList) {
        this.notificationList = notificationList;
    }

    public void add(NotificationDo notificationDo) {
        getNotificationList().add(notificationDo);
    }
}
