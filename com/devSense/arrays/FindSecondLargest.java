package com.devSense.arrays;

import java.util.Arrays;


/**
 * Input: arr[] = [12, 35, 1, 10, 34, 1]
 * Output: 34
 * Explanation: The largest element of the array is 35 and the second largest element is 34.
 * <p>
 * <p>
 * Input: arr[] = [10, 5, 10]
 * Output: 5
 * Explanation: The largest element of the array is 10 and the second largest element is 5.
 * <p>
 * <p>
 * Input: arr[] = [10, 10, 10]
 * Output: -1
 * Explanation: The largest element of the array is 10 there is no second largest element
 */
public class FindSecondLargest {

    public static void main(String[] args) {
        Integer arr[] = {12, 35, 1, 10, 34, 1};
        int a;
        a = findSecondLargestNumber(arr);
        System.out.println(a);

        int b ;
        b = findThirdLargestNumber(arr);
        System.out.println(b);
    }

    static Integer findSecondLargestNumber(Integer[] arr) {

        Arrays.sort(arr);
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1])
                return arr[i];
        }
        return -1;
    }

    static Integer findThirdLargestNumber(Integer[] arr) {

        Arrays.sort(arr);
        int n = arr.length;
//        System.out.println(Arrays.toString(arr));

        for (int i = n - 3; i >= 0; i--) {
            if (arr[i] != arr[n - 1] && arr[i] != arr[n - 2])
                return arr[i];
        }
        return -1;
    }
}
