package com.devSense.trials;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {

        int[] response;
        Map<Integer, Map<Integer, Integer>> resp;
        int[] input = {1, 3, 6, 8, 1, 7, 4, 5, 8 };
        int target = 9;
//        response = sumOfTwo(input, target);
        resp = sumOfTwowithMap(input, target);


//        System.out.println("Final output is : " + Arrays.toString(response));
    }

    public static int[] sumOfTwo(int[] num, int target) {

        System.out.println("Inside method : sumOfTwo");
        int[] resp = new int[num.length];
        System.out.println("Lenght is " + num.length);

        for (int i = 0; i < num.length; i++) {

            if (i > 0) {
                if (num[i] + num[i - 1] == target) {
                    System.out.println("Found the match");
                    resp[i] = i;
                    resp[i-1] = i-1;
                }
            }
        }

        return resp;
    }

    public static Map<Integer, Map<Integer, Integer>> sumOfTwowithMap(int[] num, int target) {

        System.out.println("Inside method : sumOfTwo");
        System.out.println("Lenght is " + num.length);

        Map<Integer,Map<Integer, Integer>> sumPos = new HashMap<>();

        for (int i = 0; i < num.length; i++) {

            if (i > 0) {
                if (num[i] + num[i - 1] == target) {
                    Map<Integer, Integer> pos = new HashMap<>();
                    System.out.println("Found the match");
                    pos.put(num[i-1], num[i]);
                    sumPos.put(i-1  ,pos);
                    System.out.println(sumPos);
                }
            }
        }
        return sumPos;
    }
}
