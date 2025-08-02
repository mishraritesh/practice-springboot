package com.project.practice.Threads;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        //Below threads are running independently and not sequential.
 /*       ThreadTest threadTest = new ThreadTest();
        System.out.println("THREAD TEST STATE"+threadTest.getState());
        threadTest.start();
        System.out.println("THREAD TEST STATE"+threadTest.getState());
        Thread.sleep(10);
        System.out.println("THREAD TEST STATE"+threadTest.getState());
        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest);// New State
        System.out.println("THREAD STATE"+thread.getState());
        thread.start(); //Runnable State
        System.out.println("THREAD STATE"+thread.getState());

        System.out.println("THREAD STATE"+thread.getState());
        thread.join();
        System.out.println("THREAD STATE"+thread.getState());*/

        Counter counter = new Counter();
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
        for (int i = 0; i <100 ; i++) {
//            System.out.println("Random String");
        }
    }
}
