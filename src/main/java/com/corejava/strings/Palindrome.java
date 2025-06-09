package com.corejava.strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(isPalindrome(s)){
            System.out.println("string is palindrome");
        } else {
            System.out.println("string isn't palindrome");
        }
    }
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i<s.length()/2 && j > i) {
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
