package com.devSense.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string you need to print longest possible substring that has exactly M unique characters. If there is more than one substring of longest possible length, then print any one of them.
 * <p>
 * Examples:
 * <p>
 * <p>
 * Input: Str = “aabbcc”, k = 1
 * Output: 2
 * Explanation: Max substring can be any one from {“aa” , “bb” , “cc”}.
 * <p>
 * <p>
 * Input: Str = “aabbcc”, k = 2
 * Output: 4
 * Explanation: Max substring can be any one from {“aabb” , “bbcc”}.
 * <p>
 * <p>
 * Input: Str = “aabbcc”, k = 3
 * Output: 6
 * Explanation:
 * There are substrings with exactly 3 unique characters
 * {“aabbcc” , “abbcc” , “aabbc” , “abbc” }
 * Max is “aabbcc” with length 6.
 * <p>
 * <p>
 * Input: Str = “aaabbb”, k = 3
 * Output: Not enough unique characters
 * Explanation: There are only two unique characters, thus show error message.
 * <p>
 * We declare a Map<Character,Integer> data structure to store frequency of characters.
 * Here we use acquire and release property .
 * In this we declare two pointers i and j, we traverse from i pointer and acquire characters
 * until map size is greater than K.
 * When map size get equals to k we store the length of i-j in a variable and traverse forward.
 * Once map size exceeds K,then we start releasing characters from map with the help of j pointer
 * till map size again equals K, and we store the length and compare with previous length
 * and this way the algorithm continues.
 */
public class LongestSubString {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        String s = "aabacbebebe";
        int k =3 ;

        System.out.println(longestSubStringWithKchars(s,k));
    }

    static int longestSubStringWithKchars(String s, int k) {

        Map<Character, Integer> structure = new HashMap<>();

        int i = -1;
        int j = -1;
        int ans = -1;

        while (true) {

            boolean flag1 = false;
            boolean flag2 = false;

            while (i < s.length() - 1) {
                flag1 = true;
                i++;
                char ch = s.charAt(i);
                structure.put(ch, structure.getOrDefault(ch, 0) + 1);

                if (structure.size() < k) {
                    continue;
                } else if (structure.size() == k) {
                    int len = i - j;
                    ans = Math.max(len, ans);
                } else
                    break;
            }
            while (j < i) {
                flag2 = true;
                j++;
                char ch = s.charAt(j);

                if (structure.get(ch) == 1) {
                    structure.remove(ch);
                } else
                    structure.put(ch, structure.get(ch) - 1);

                if (structure.size() == k) {
                    int len = i - j;
                    ans = Math.max(ans, len);
                    break;
                } else if (structure.size() > k) {
                    continue;
                }
            }
            if (flag1 ==false && flag2==false){
                break;
            }
        }
        return ans;
    }
}
