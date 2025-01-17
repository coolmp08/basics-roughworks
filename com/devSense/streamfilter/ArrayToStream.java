package com.devSense.streamfilter;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStream {

    public static void main(String []args){

        int[] arra1 = {1,2,3};
        IntStream intStream = Arrays.stream(arra1);

        Integer[] arra2 = {1,3,5,7};
        Stream<Integer> InteStream = Stream.of(arra2);
    }
}
