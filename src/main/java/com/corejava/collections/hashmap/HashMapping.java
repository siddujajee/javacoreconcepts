// storing apparitions using hashmap
package com.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapping {
    static HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers you want to enter");
        int n = scan.nextInt();
        System.out.println("enter " + n + " numbers space seperated.");
        for(int i=0;i<n;i++){
            int m = scan.nextInt();
            hm.put(m, hm.getOrDefault(m, 0)+1);
        }
        
        System.out.println("enter number of iterations");
        int iterations = scan.nextInt();
        while(iterations > 0){
            System.out.println("enter the integer value of which you want to check the apparitions");
            int ele = scan.nextInt();
            System.out.println(ele + " appears " + hm.getOrDefault(ele, 0) + " times.");
            iterations--;
        }
        
    }
}
