package com.corejava.Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        isPalindrome(s, 0, s.length());
    }
    static void isPalindrome(String s, int i, int length){
        if(i>=length/2){
            System.out.println("string is a palindrome");
            return;
        } else {
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(length-i-1))){
                isPalindrome(s, i+1, length);
            } else {
                System.out.println("string is not a palindrome");
                return;
            }
        }
    }
}
