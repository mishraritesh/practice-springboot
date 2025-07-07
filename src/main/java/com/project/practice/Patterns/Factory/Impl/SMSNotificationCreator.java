package com.project.practice.Patterns.Factory.Impl;

import com.project.practice.Patterns.Factory.Notification;
import com.project.practice.Patterns.Factory.NotificationCreator;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotifier();
    }
}
