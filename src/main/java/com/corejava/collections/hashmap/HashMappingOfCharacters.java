package com.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMappingOfCharacters {
    static HashMap<Character, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }

        System.out.println("enter the number of iterations");
        int iterations = scan.nextInt();
        scan.nextLine();
        while(iterations>0){
            System.out.println("enter the character you want to check the frequency");
            char c = scan.nextLine().charAt(0);
            System.out.println(c + " appears " + hm.getOrDefault(c, 0) + " times.");
            iterations--;
        }
    }
}
