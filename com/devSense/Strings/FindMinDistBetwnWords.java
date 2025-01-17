package com.devSense.Strings;

/**
 * Input: S = { "the", "quick", "brown", "fox", "quick"}, word1 = "the", word2 = "fox"
 * Output: 3
 * Explanation: Minimum distance between the words "the" and "fox" is 3
 * <p>
 * <p>
 * Input: S = {"geeks", "for", "geeks", "contribute",  "practice"}, word1 = "geeks", word2 = "practice"
 * Output: 2
 * Explanation: Minimum distance between the words "geeks" and "practice" is 2
 */
public class FindMinDistBetwnWords {

    public static void main(String[] args) {
        String[] S
                = { "the", "quick", "brown", "fox", "quick" };

        String word1 = "brown", word2 = "quick";

        System.out.println(findMinimumDistanceBtwnTwoWords(S, word1, word2));

    }

    static Integer findMinimumDistanceBtwnTwoWords(String[] strings, String word1, String word2) {

        int d1 = -1, d2 = -1;
        int ans = Integer.MAX_VALUE;

        /*String Traversal */

        for (int i = 0; i < strings.length; i++) {
            if(word1 == strings[i])
                d1 = i;
            if(word2 == strings[i])
                d2 = i;
            if(d1 != -1 && d2 != -1)
                ans = Math.min(ans, Math.abs(d1 -d2 ));
        }
        return ans;
    }
}
