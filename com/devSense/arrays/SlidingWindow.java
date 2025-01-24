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
 * <p>
 * Applying the sliding window technique:
 * <p>
 * We compute the sum of the first k elements out of n terms using a linear loop
 * and store the sum in variable window_sum.
 * Then we will traverse linearly over the array till it reaches the end and simultaneously keep track of the maximum sum.
 * To get the current sum of a block of k elements just subtract the first element from the previous block and add the last element of the current block.
 */
public class SlidingWindow {

    public static void main(String[] args) {

        System.out.println("Hello World !");

        int k = 4;
        int [] arr = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        System.out.println(slidingWindowMaxSum(arr, k));
    }

    static int slidingWindowMaxSum(int arr[], int k) {
        int n = arr.length;

        if (n <= k) {
            System.out.println("n must be greater than k");
            return -1;
        }
        int max_sum = 0;

        for (int i = 0; i < k; i++) {
            max_sum += arr[i];
        }

        int window_sum = max_sum;

        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }
}

