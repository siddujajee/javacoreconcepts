// leetcode: https://leetcode.com/problems/powx-n/
package com.corejava.Recursion;

public class PowerOfNum {
    public static void main(String[] args) {
        // double x = 2;
        // int n = 4;

        double x = 2.00000;
        int n = -2;
        // calculate x raise to power n

        System.out.println("power of " + x + " on " + n + " is: ");
        System.out.println(pow(x, n));
    }

    public static double pow(double x, int n) {
        int power = n;
        power = (power < 0) ? power * -1 : power;
        double res = 1;
        while (power > 0) {
            if (power % 2 == 0) {
                x = x * x;
                power = power / 2;
            } else {
                res = res * x;
                power = power - 1;
            }
        }

        if (n < 0)
            return (1 / res);
        return res;
    }
}
