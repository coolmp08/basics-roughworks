package com.devSense.bases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxLenString {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Christopher");

        // Sort the list by string length in descending order
//        names.sort(Comparator.comparingInt(String::length).reversed());
        names.sort((a,b) -> Integer.compare(a.length(),b.length()));
        // Print the sorted list
        System.out.println(names); // Output: [Christopher, Alice, John, Bob]
        System.out.println(names.get(names.size()-1)); //output: Christopher
    }
}
