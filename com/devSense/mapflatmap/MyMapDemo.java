package com.devSense.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MyMapDemo {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Python", "Java", "C", "CloudTech");

        List<String> languagesUPC = languages.stream()
                        .map(String::toUpperCase)
                                .collect(Collectors.toList());

        System.out.println(languagesUPC);
    }
}
