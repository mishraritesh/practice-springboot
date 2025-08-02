package com.project.practice.Threads;

public class ThreadTest extends  Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < 1000 ; i++){
//            System.out.println("Thread Exec!");
        }
    }
}
