package com.devSense.arrays;

/**
 * Given an integer array, the task is to find the maximum product of any subarray.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {-2, 6, -3, -10, 0, 2}
 * Output: 180
 * Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180
 * <p>
 * <p>
 * Input: arr[] = {-1, -3, -10, 0, 60}
 * Output: 60
 * Explanation: The subarray with maximum product is {60}.
 */
public class MaxProductSubArray {


    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b,c));
    }

    static int max(int a, int b, int c) {
        return Math.max( a, Math.max(b, c));
    }

    static int maxProduct(int[] arr) {
        int n = arr.length;
        int currMin = arr[0];
        int currMax = arr[0];
        int maxProd = arr[0];

        for (int i = 1; i < n; i++) {
            int temp = max(arr[i], arr[i] * currMax, arr[i] * currMin);
            currMin = min(arr[i], arr[i] * currMax, arr[i] * currMin);
            currMax = temp;

            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
    }

    public static void main(String[] args){
        int[] arr = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));
    }

}
