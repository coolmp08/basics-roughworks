package com.devSense;

/**
 * Count ways to reach end from start stone with at most K jumps at each step
 *
 * Given N stones in a row from left to right. From each stone, you can jump to at most K stones.
 * The task is to find the total number of ways to reach from sth stone to Nth stone.
 *
 * Example: Input: N = 5, s = 2, K = 2
 * Output: Total Ways = 3
 * Explanation:
 * Assume s1, s2, s3, s4, s5 be the stones. The possible paths from 2nd stone to 5th stone:
 * s2 -> s3 -> s4 -> s5
 * s2 -> s4 -> s5
 * s2 -> s3 -> s5
 * Hence total number of ways = 3
 * Input: N = 8, s = 1, K = 3
 * Output: Total Ways = 44
 *
 * Approach
 * Let assume jmp[i] be the number of ways to reach ith stone.
 * Since there are at-most K jumps, So the ith stone can be reach by all it’s previous K stones.
 * Iterate for all possible K jumps and keep adding this possible combination to the array jmp[].
 * Then the total number of possible ways to reach Nth node from sth stone will be jmp[N-1].
 */
public class MaxJumps {

    public static void main(String [] args){
        int totalWays = totalJumps(1,2,5);
    }

    /**
     *
     * @param s - start position
     * @param k - max allowed jumps
     * @param n - end position/destination
     * @return max jumps
     */
    static int totalJumps(int s, int k, int n){
        System.out.println("Finding max number of ways to reach from s to n");

        int[] jmps = new int[n];

        return 0;
    }
}
