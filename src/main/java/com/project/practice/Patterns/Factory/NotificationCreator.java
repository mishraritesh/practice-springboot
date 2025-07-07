package com.project.practice.Patterns.Factory;

public abstract class NotificationCreator {
    public abstract Notification createNotification();

    public void sendNotification() {
        Notification notification = createNotification();
        notification.notifyUser();
    }
}
