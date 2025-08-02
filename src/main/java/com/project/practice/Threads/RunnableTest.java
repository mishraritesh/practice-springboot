package com.project.practice.Threads;

public class RunnableTest implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000 ; i++){
//            System.out.println("Runnable Thread Exec!");
        }
    }
}
