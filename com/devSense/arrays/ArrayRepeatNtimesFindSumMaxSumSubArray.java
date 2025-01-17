package com.devSense.arrays;


import java.util.Arrays;

/**
 * Given an integer k and an integer array arr[] of n elements, the task is to find the largest sub-array sum in the modified array (formed by repeating the given array k times). For example, if arr[] = {1, 2} and k = 3 then the modified array will be {1, 2, 1, 2, 1, 2}.
 * <p>
 * Examples:
 * <p>
 * <p>
 * Input: arr[] = {1, 2}, k = 3
 * Output: 9
 * Modified array will be {1, 2, 1, 2, 1, 2}
 * And the maximum sub-array sum will be 1 + 2 + 1 + 2 + 1 + 2 = 9
 * <p>
 * <p>
 * Input: arr[] = {1, -2, 1}, k = 5
 * Output: 2
 */
public class ArrayRepeatNtimesFindSumMaxSumSubArray {

    public static void main(String[] args) {

        int k = 2;
//        int[] arr = {1, 2};
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int n = arr.length;
        int x = n * k;
        System.out.println(x);
        int[] repeated = new int[x];

        if (k > 1) {
            for (int i = 0; i < x; i++) {
                repeated[i] = arr[i % n];
            }
        }else
            repeated = arr;


        System.out.println(Arrays.toString(repeated));

        int val = MaxSubArraySum.maxSubArraySum(repeated);

        System.out.println("Max Sub Array Sum is: " + val);
    }

}
