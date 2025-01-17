package com.devSense.multithreading.atomicity;

import java.util.concurrent.atomic.AtomicInteger;

class SharedCounter {

    private AtomicInteger count = new AtomicInteger(0);

    /*public SharedCounter(int count) {
        this.count = count;
    }*/

    public SharedCounter() {

    }

    public int getCount() {
        return count.get();
    }

    /*public void setCount(int count) {
        this.count = count;
    }*/

    public void increment() {
        count.incrementAndGet();
    }
}

public class Atomic {

    public static void main(String[] args) throws InterruptedException {

        SharedCounter sharedCounter = new SharedCounter();

        new Thread(() -> {
            System.out.println("Thread 1 started");
            for (int i = 0; i < 50000; i++) {
                sharedCounter.increment();
            }
            System.out.println("Thread 1 Completed");
        }).start();

//        Thread.sleep(1000);


        new Thread(() -> {
            System.out.println("Thread 2 started");
            for (int i = 0; i < 50000; i++) {
                sharedCounter.increment();
            }
            System.out.println("Thread 2 Completed");
        }).start();
//        Thread.sleep(1000);

        System.out.println("Final Count is : " + sharedCounter.getCount());
    }
}
