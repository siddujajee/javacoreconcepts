package com.corejava.strings;

public class ReverseWords {
    public static void main(String[] args) {
        // String s = " hello world "; // test case 1
        String s = "the sky is blue"; // test case 2
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() == 0) {
                continue;
            }
            if (result.length() == 0) {
                result.append(words[i]);
            } else {
                result.append(" ").append(words[i]);
            }
        }
        return result.toString();
    }
}
