package com.project.practice.Patterns.Singleton;

//Singleton logger
public class Logger {
    // volatile keyword makes the instance available to all threads once it's assigned.
    private static volatile Logger instance;

    //Private constructor so that no one else can create the Object of logger class
    private Logger() {}

    public static Logger getInstance() {
        if(instance == null){
            synchronized (Logger.class){
                if(instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public static void log(String msg){
        System.out.println(msg);
    }
}
