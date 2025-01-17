package com.devSense.streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterDemo {

    public static void main(String[] args) {

        List<Integer> intlist = Arrays.asList(5, 7, 98, 947, 54, 73, 9);

        Stream<Integer> evenInts =
                intlist.stream().filter(i -> i.intValue() % 2 == 0);

        Stream<Integer> oddInts = intlist.stream().filter(i -> i.intValue() % 2 == 1);

        System.out.println(evenInts.collect(Collectors.toList()));
        System.out.println(oddInts.collect(Collectors.toList()));
    }
}
