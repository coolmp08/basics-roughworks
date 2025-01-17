package com.devSense.Strings;

public class BuildervsBuffer {

    public static void main(String[] args) {

//        StringBuilder sharedstringBuilder = new StringBuilder();
        StringBuffer sharedstringBuilder = new StringBuffer();
        //create two threads to modify the same StringBuilder instance

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedstringBuilder.append("A");
            }
        }
        );

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedstringBuilder.append("B");
            }
        }
        );

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

//        System.out.println("Result (StringBuilder): " + sharedstringBuilder.toString().length());
        System.out.println("Result (StringBuffer): " + sharedstringBuilder.toString().length());

    }
}
