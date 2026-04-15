package com.corejava.Recursion;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "  -134-23";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        if (s == null || s == "")
            return 0;

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                i++;
            } else {
                break;
            }
        }

        if (i == s.length()) {
            return 0;
        }

        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        if (i == s.length())
            return 0;
        long res = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            res = res * 10 + (s.charAt(i) - '0');
            if (sign * res <= INT_MIN) {
                return INT_MIN;
            }
            if (sign * res >= INT_MAX) {
                return INT_MAX;
            }
            i++;
        }
        return (int) (res * sign);

    }
}
