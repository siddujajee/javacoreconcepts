package com.corejava.Hashing;

import java.util.Scanner;

public class CharacterHashing {
    static int[] hash = new int[26]; // 26 if we know for sure that string will have only lowercase characters or uppercase characters in case of mixture of character take 256 
    // static char[] hash = new char[256]; // if string is mixture of characters
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String s = scan.nextLine();
        System.out.println("enter number of iterations");
        int iterations = scan.nextInt();

        // prefetching
        for(int i =0;i<s.length();i++){
            hash[s.charAt(i) - 'a']++;
        }
        scan.nextLine();
        while(iterations > 0 ){
            System.out.println("enter the character of which you want to find the number of apparations");
            char c = scan.nextLine().charAt(0);
            System.out.println(c + " appears " + hash[c-'a'] + " times.");
            iterations--;
        }


    }
}
