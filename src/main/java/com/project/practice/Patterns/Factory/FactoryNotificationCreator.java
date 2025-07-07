package com.project.practice.Patterns.Factory;

import com.project.practice.Patterns.Factory.Impl.EmailNotificationCreator;
import com.project.practice.Patterns.Factory.Impl.PushlNotificationCreator;
import com.project.practice.Patterns.Factory.Impl.SMSNotificationCreator;

public class FactoryNotificationCreator {

    public static void main(String[] args) {
        NotificationCreator notificationCreator;

        notificationCreator = new EmailNotificationCreator();
        notificationCreator.sendNotification();

        notificationCreator = new SMSNotificationCreator();
        notificationCreator.sendNotification();

        notificationCreator = new PushlNotificationCreator();
        notificationCreator.sendNotification();
    }
}
