package com.project.practice.Patterns.Factory.Impl;

import com.project.practice.Patterns.Factory.Notification;
import com.project.practice.Patterns.Singleton.Logger;

public class SMSNotifier implements Notification {
    @Override
    public void notifyUser() {
        Logger.log("SMS Notification sent");
        System.out.println("SMS Notifier");
    }
}
