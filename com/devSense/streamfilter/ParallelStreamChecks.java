package com.devSense.streamfilter;

import java.util.Arrays;

public class ParallelStreamChecks {

    public static void main(String[] args) {

        int[] intArray = new int[1000000];     // 1 million in size
        Arrays.fill(intArray, 2);

        //calculate sum of squares

        long startTime = System.currentTimeMillis();

        long sum = Arrays.stream(intArray)
                .mapToLong(n -> n * n)
                .sum();

        long endTime = System.currentTimeMillis();

        System.out.println( endTime - startTime);

        //calculate sum of squares using parallelStream

        long startTimeP = System.currentTimeMillis();

        long sumP = Arrays.stream(intArray)
                .parallel()
                .mapToLong(n -> n * n)
                .sum();

        long endTimeP = System.currentTimeMillis();

        System.out.println( endTimeP - startTimeP);
    }
}
