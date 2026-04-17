package com.corejava.Recursion;

public class CountGoodNumbers {

    public static long power(long x, long n, int mod) {
        long result = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                x = x * x;
                n = n / 2;
            } else {
                result = result * x;
                n = n - 1;
            }
        }
        return result;
    }

    public static int countGoodNumbers(int n) {
        long even = n / 2 + (n % 2);
        long odd = n / 2;
        int mod = (int) 1e9 + 7;
        return (int) ((power(5, even, mod) * power(4, odd, mod)) % mod);
    }

    public static void main(String[] args) {
        // int n = 1; // test case 1
        int n = 4; // test case 2
        System.out.println(countGoodNumbers(n));
    }
}
