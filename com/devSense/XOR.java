package com.devSense;

public class XOR {
    public static void main(String[] args) {
        System.out.println("2 XOR 1: " + (2 ^ 1)); // Output: 0
        System.out.println("2 XOR 7: " + (2 ^ 7)); // Output: 1
        System.out.println("1 XOR 2: " + (1 ^ 2)); // Output: 1
        System.out.print("1 XOR 1: " + (1 ^ 1)); // Output: 0

        int i = getXOR(1,1);
        System.out.println(Integer.valueOf(i));
    }

    public static int getXOR(int x, int y) {
        return (x + y) - 2 * (x & y);
    }

}