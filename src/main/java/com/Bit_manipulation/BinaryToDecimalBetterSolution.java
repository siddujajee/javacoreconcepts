package com.Bit_manipulation;

public class BinaryToDecimalBetterSolution {
    public static void main(String[] args) {
        String s = "1101";
        long result = iterate(s);
        System.out.println(result);
    }

    public static long iterate(String s) {
        long power = 1;
        long result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') == 1) {
                result = result + power;
            }
            power = power * 2;
        }
        return result;
    }
}
