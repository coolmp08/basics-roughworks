package com.devSense.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String [] args){

        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("java","C#"),
                Arrays.asList("Angular","javascript"),
                Arrays.asList("HTML5","CSS")
        );

        List<String> languages = nestedList.stream()
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(languages);
    }
}
