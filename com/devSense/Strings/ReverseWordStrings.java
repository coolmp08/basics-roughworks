package com.devSense.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Input: str = “i.like.this.program.very.much”
 * Output: str = “much.very.program.this.like.i”
 * <p>
 * <p>
 * Input: str = ”..geeks..for.geeks.”
 * Output: str = “geeks.for.geeks”
 */
public class ReverseWordStrings {

    public static void main(String[] args) {

        String str = "i.like.this.program.very.much";
        str = "..geeks..for.geeks.";
        String revString = ReverseWords(str);
        System.out.println(revString);
        
    }

    static String ReverseWords(String input) {
        //split with . and ignore multiple..

        List<String> words = new ArrayList<>();
        String[] parts = input.split("\\.");

        for (String word : parts) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }
        Collections.reverse(words);
        return String.join(".", words);
//        return "Hello";

    }

}
