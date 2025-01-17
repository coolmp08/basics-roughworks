package com.devSense.arrays;

import java.util.Arrays;

/**
 * Given an array arr[] and an integer K, the task is to reverse every subarray formed by consecutive K elements
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], K = 3
 * Output: 3, 2, 1, 6, 5, 4, 9, 8, 7
 * <p>
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], K = 5
 * Output: 5, 4, 3, 2, 1, 8, 7, 6
 * <p>
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 6], K = 1
 * Output: 1, 2, 3, 4, 5, 6
 * <p>
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], K = 10
 * Output: 8, 7, 6, 5, 4, 3, 2, 1
 * <p>
 * <p>
 * Consider every sub-array of size K starting from the beginning of the array and reverse it. We need to handle some special cases.
 * <p>
 * <p>
 * If K is not a multiple of n where n is the size of the array, for the last group
 * we will have less than k elements left, we need to reverse all remaining elements.
 * If K = 1, the array should remain unchanged. If K >= n, we reverse all elements present in the array.
 * To reverse a subarray, maintain two pointers: left and right. Now, swap the elements at left
 * and right pointers and increment left by 1 and decrement right by 1.
 * Repeat till left and right pointers don’t cross each other.
 */

public class ReverseArrayInGroupSize {

    public static void main(String[] args) {

        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 1;
        Integer[] ja = ReverseArrayInGroupSize(arr, k);

        System.out.println(Arrays.asList(ja));
    }

    static Integer[] ReverseArrayInGroupSize(Integer[] arr, Integer k) {

        int n = arr.length;
//        System.out.println(n);

        for (int i = 0; i < n; i += k) {

//            System.out.println(i);
            int left = i;

            int right = Math.min(i + k - 1, n - 1);
            int temp;

            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 1;
                right -= 1;
            }
        }

        return arr;
    }

}
