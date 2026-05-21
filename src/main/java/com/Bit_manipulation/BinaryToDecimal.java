package com.Bit_manipulation;

public class BinaryToDecimal {
    public static int result;

    public static void main(String[] args) {
        String s = "1101";
        System.out.println("decimal representation of given binary " + s + " is " + iterate(s));
    }

    public static int iterate(String s) {
        int i = s.length() - 1;
        long power = 0;
        while (i >= 0) {
            result += (s.charAt(i) - '0') * powerOf(2, power);
            i--;
            power++;
        }
        return result;
    }

    public static long powerOf(int num, long power) {
        long powerOfNum = 1;
        while (power > 0) {
            powerOfNum = powerOfNum * num;
            power--;
        }
        return powerOfNum;
    }
}
