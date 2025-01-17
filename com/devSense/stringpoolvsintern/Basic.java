package com.devSense.stringpoolvsintern;

public class Basic {


    public static void main(String[] args) {
        String s1 = "Hello";            //goes to string-pool
        String s2 = new String("Hello");        //goes to heap
        String s3 = s2.intern();
        //tries to find if same string available in string-pool
        // and returns a reference of it, in case its not present it will create a new one inside string pool.

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
