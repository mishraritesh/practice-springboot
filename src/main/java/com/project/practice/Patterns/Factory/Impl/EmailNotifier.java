package com.project.practice.Patterns.Factory.Impl;

import com.project.practice.Patterns.Factory.Notification;
import com.project.practice.Patterns.Singleton.Logger;

public class EmailNotifier implements Notification {

    @Override
    public void notifyUser() {
        Logger.log("Email Notification sent");
        System.out.println("Email Notifier");
    }
}
