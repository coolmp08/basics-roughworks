package com.devSense.Strings;


import java.util.Arrays;

/**
 * Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
 * Output: "gee"
 * Explanation: "gee" is the longest common prefix in all the given strings: "geeksforgeeks", "geeks", "geeks" and "geezer".
 * <p>
 * Input: arr[] = ["apple", "ape", "april"]
 * Output : "ap"
 * Explanation: "ap" is the longest common prefix in all the given strings: "apple", "ape" and "april".
 * <p>
 * Input: arr[] = ["hello", "world"]
 * Output: ""
 * Explanation: There’s no common prefix in the given strings.
 */

public class LongestCommonPrefix {


    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String longestCommonPrefix = LongestCommonPrefix(arr);
        System.out.println(longestCommonPrefix);
    }

    static String LongestCommonPrefix(String[] arr) {
        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];
        System.out.println("sorted array has first " + first + " and last string " + last);

        int minLength = Math.min(first.length(), last.length());
        System.out.println(minLength);

        int i = 0;
        while(i<minLength && first.charAt(i) == last.charAt(i)){
            i++;
        }

        return first.substring(0,i);

//        System.out.println(Arrays.stream(arr).sorted().collect(Collectors.toList()));

//        return "Hello";
    }

}
