// when ith bit of binary representation of given number is 1 that ith bit is said to be "set"
package com.Bit_manipulation;

public class CheckIfBitIsSet {
    public static void main(String[] args) {
        int n = 13;
        int i = 1;
        System.out.println((n & 1 << i) != 0);
    }

    public static int leftShift(int num, int shift) {
        return num * power(2, shift);
    }

    public static int power(int num, int pow) {
        int result = 1;
        while (pow > 0) {
            result = result * num;
            pow--;
        }

        return result;
    }
}
