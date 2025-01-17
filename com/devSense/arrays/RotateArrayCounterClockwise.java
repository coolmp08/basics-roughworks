package com.devSense.arrays;


import java.util.Arrays;

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
public class RotateArrayCounterClockwise {

    public static void main(String[] args) {

//        Integer arr[] = {1, 2, 3, 4, 5, 6}, d = 4;
        Integer arr[] = {1, 2, 3}, d = 4;
        Integer ja[] = rotateArrayCounterClockwise(arr, d);

        System.out.println(Arrays.asList(ja));

    }

    // Function to left rotate array by d positions
    static Integer[] rotateArrayCounterClockwise(Integer[] arr, Integer d) {

        int n = arr.length;

        // Repeat the rotation d times
        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }

        return arr;
    }
}
