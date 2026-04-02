package com.corejava.strings;

public class LargestOddNumInString {
    public static void main(String[] args) {
        // String num = "42"; // tesst case 1
        // String num = "52"; // test case 2
        String num = "00345"; // test case 3
        System.out.println(largestOdd(num));
    }

    public static String largestOdd(String num) {
        int start = 0;
        while (num.charAt(start) == '0') {
            start++;
        }

        for (int i = num.length() - 1; i >= start; i--) {
            int ch = num.charAt(i) - '0';
            if (ch % 2 != 0) {
                return num.substring(start, i + 1);
            }
        }
        return "no sub string possible";
    }
}
