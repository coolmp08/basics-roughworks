package com.devSense;

import java.util.concurrent.CompletableFuture;

public class AsyncInJava {

    public static void main(String []args){
        long startTime = System.currentTimeMillis();
        CompletableFuture<Void> paymentProcess = CompletableFuture.runAsync(
                () ->{
                    try {
                        Thread.sleep(2000);
                        System.out.println("Payment Process completed by " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

        CompletableFuture<Void> InventoryProcess = CompletableFuture.runAsync(
                () ->{
                    try {
                        Thread.sleep(2000);
                        System.out.println("Invetory Process completed by " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

        CompletableFuture<Void> allTask = CompletableFuture .allOf(
                paymentProcess,
                InventoryProcess
        );

        allTask.join();

        long endTime = System.currentTimeMillis();

        long timetaken = endTime-startTime;

        System.out.println("Time taken is: " + timetaken);

    }
}
