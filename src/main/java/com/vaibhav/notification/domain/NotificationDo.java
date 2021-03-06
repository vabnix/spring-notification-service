package com.vaibhav.notification.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.UUID;

public class NotificationDo implements Serializable {

    @Id
    private UUID id;
    private String user;
    private String message;
    @CreatedDate
    private String createTimeStamp;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }
}
