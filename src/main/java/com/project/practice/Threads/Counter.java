package com.project.practice.Threads;

public class Counter {
    private int count = 0;
    public Counter() {
        count = 0;
    }
    public synchronized void increment() {
        count++; //critical section
    }
    public int getCount() {
        return count;
    }
}
