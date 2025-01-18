package com.devSense.arrays;

/**
 * Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.
 * <p>
 * Input  : arr[] = {100, 200, 300, 400}, k = 2
 * Output : 700
 * <p>
 * <p>
 * Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
 * Output : 39
 * We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.
 * <p>
 * <p>
 * Input  : arr[] = {2, 3}, k = 3
 * Output : Invalid
 * There is no subarray of size 3 as size of whole array is 2.
 */
public class SlidingWindowsNaive {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int k = 4;
        int [] arr = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        System.out.println(slidingWindowNaiveMaxSum(arr, k));
    }


    static int slidingWindowNaiveMaxSum(int arr[], int k) {
        int n = arr.length;
        int max_sum = 0;

        for (int i = 0; i < n - k + 1; i++) {
            int curr_sum = 0;
            for (int j = 0; j < k; j++) {
                curr_sum = curr_sum + arr[i+j];
            }
            max_sum = Math.max(curr_sum, max_sum);
        }
        return max_sum;
    }
}
