package com.project.practice.Patterns.Factory.Impl;

import com.project.practice.Patterns.Factory.Notification;
import com.project.practice.Patterns.Singleton.Logger;

public class PushlNotifier implements Notification {
    @Override
    public void notifyUser() {
        Logger.log("Push Notification sent");
        System.out.println("Push Notifier");
    }
}
