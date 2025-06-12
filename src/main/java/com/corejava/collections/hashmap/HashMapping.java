// storing apparitions using hashmap
package com.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapping {
    static HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        
        // prefetch using hashmap
        
        for(int x: a){
            hm.put(x, hm.getOrDefault(x, 0)+1);
        }
        System.out.println("enter number of iterations");
        int iterations = scan.nextInt();
        while(iterations > 0){
            System.out.println("enter the integer value of which you want to check the appearance");
            int ele = scan.nextInt();
            System.out.println(ele + " appears " + hm.getOrDefault(ele, 0) + " times.");
            iterations--;
        }
        
    }
}
