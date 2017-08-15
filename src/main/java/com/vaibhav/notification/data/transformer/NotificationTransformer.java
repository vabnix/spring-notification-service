package com.vaibhav.notification.data.transformer;

import com.vaibhav.notification.data.Notification;
import com.vaibhav.notification.domain.NotificationDo;

public class NotificationTransformer {

    public static Notification transform(NotificationDo request) {
        Notification notification = new Notification();
        if (request != null) {
            notification.setId(request.getId());
            notification.setUser(request.getUser());
            notification.setCreateTimeStamp(request.getCreateTimeStamp());
            notification.setMessage(request.getMessage());
        }
        return notification;
    }
}
