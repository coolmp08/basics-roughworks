package com.devSense.Strings;

import java.util.HashMap;

/***
 *
 * Given string S of size N consisting of K distinct characters and (N – K) ‘?’s,
 * the task is to replace all ‘?’ with existing characters from the string such that
 * every substring of size K has consisted of unique characters only.
 * If it is not possible to do so, then print “-1”.
 *
 * Examples:
 *
 *
 * Input: S = “????abcd”, K = 4
 * Output: abcdabcd
 * Explanation:
 * Replacing the 4 ‘?’s with “abcd” modifies string S to “abcdabcd”, which satisfies the given condition.
 *
 *
 * Input: S = “?a?b?c”, K = 3
 * Output: bacbac
 * Explanation:
 * Replacing S[0] with ‘b’, S[2] with ‘c’ and S[4] with ‘a’ modifies string S to “bacbac”,
 * which satisfies the given condition.
 *
 *
 * The idea is based on the observation that in the final resultant string,
 * each character must appear after exactly K places, like the (K + 1)th character must be the same as 1st,
 * (K + 2)th character must be the same as 2nd, and so on.
 */
public class KLenghtSubStrRepeating {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        String s = "????abcd";
        int k =4;
        kLenghtSubStrRepeating(s, k);
    }

    static void kLenghtSubStrRepeating(String s, int k) {

        int n = s.length();
        char[] chars = s.toCharArray();
        HashMap<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (chars[i] != '?')
                map.put(i % k, chars[i]);
        }

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(i % k)){
                System.out.println("-1");
                return;
            }
            chars[i] = map.getOrDefault(i%k, chars[i]);
        }

        System.out.println(new String(chars));
    }
}
