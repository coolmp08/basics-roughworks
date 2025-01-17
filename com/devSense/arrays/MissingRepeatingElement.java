package com.devSense.arrays;


import java.util.Arrays;
import java.util.HashSet;

/**
 * Input: arr[] = {3, 1, 3}
 * Output: Missing = 2, Repeating = 3
 * Explanation: In the array, 2 is missing and 3 occurs twice
 * <p>
 * <p>
 * Input: arr[] = {4, 3, 6, 2, 1, 1}``
 * Output: Missing = 5, Repeating = 1
 */
public class MissingRepeatingElement {

    public static void main(String[] args) {

        Integer[] arr = {7, 3, 4, 5, 5, 6, 2};
//        int[] arr = {3, 1, 3};
//        missingRepeatedElementInArrayUsingSort(arr);
        missingRepeatedElementInArrayUsingXOR(arr);
    }

    static void missingRepeatedElementInArrayUsingSort(Integer[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.asList(arr));
        int n = arr.length;

        int repeating = -1, missing = -1;

        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < n; i++) {
            s.add(arr[i]);
        }
        System.out.println(s);
//        System.out.println(s.stream().max(Integer::compareTo));
        int max = s.stream().max(Integer::compareTo).get();
        System.out.println(max);
    }

    static void missingRepeatedElementInArrayUsingXOR(Integer[] arr) {

        int n = arr.length;
        int xor1 = 0;
        int x = 0, y = 0;
        int set_bit_no;

        for (int i = 0; i < n; i++) {
            xor1 ^= arr[i];
            xor1 ^= i + 1;
        }

        set_bit_no = xor1 & ~(xor1 - 1);
        System.out.println(set_bit_no);


    }

    static void missingRepeatedElementInArray(int[] arr) {

        int n = arr.length;
        boolean[] visited = new boolean[n + 1];
        int repeating = -1, missing = -1;

        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (visited[arr[i]])
                repeating = arr[i];
            else
                visited[arr[i]] = true;
        }

        for (int j = 1; j <= n; j++) {
            if (!visited[j]) {
                missing = j;
                break;
            }
        }
        System.out.println("Repeating : " + repeating);
        System.out.println("Missing : " + missing);
    }
}
