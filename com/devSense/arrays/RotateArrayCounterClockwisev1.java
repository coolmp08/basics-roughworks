package com.devSense.arrays;


/**
 * Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
 * Output: {3, 4, 5, 6, 1, 2}
 * Explanation: After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}
 * <p>
 * <p>
 * Input: arr[] = {1, 2, 3}, d = 4
 * Output: {2, 3, 1}
 * Explanation: The array is rotated as follows:
 * <p>
 * <p>
 * After first left rotation, arr[] = {2, 3, 1}
 * After second left rotation, arr[] = {3, 1, 2}
 * After third left rotation, arr[] = {1, 2, 3}
 * After fourth left rotation, arr[] = {2, 3, 1}
 * <p>
 * In each iteration, shift the elements by one position to the left in a circular fashion
 * (the first element becomes the last).
 * Perform this operation d times to rotate the elements to the left by d positions.
 */

public class RotateArrayCounterClockwisev1 {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;

        rotateArrayCounterClockwise(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static void rotateArrayCounterClockwise(Integer[] arr, int d) {
        int n = arr.length;

        reverse(arr, 0, d - 1);

        reverse(arr, d, n - 1);

        reverse(arr, 0, n - 1);

    }

    static void reverse(Integer[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
