package com.corejava.Arrays;

import java.util.HashMap;

public class SubArrayCountXorOptimisedSolution {
    public static void main(String[] args) {
        // int[] nums = { 4, 2, 2, 6, 4 };
        // int k = 6;

        // int[] nums = { 5, 6, 7, 8, 9 };
        // int k = 5;

        int[] nums = { 0, 0, 0 };
        int k = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int xor = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
            if (xor == k) {
                count++;
            }
            int remaining = xor ^ k;
            if (hm.get(remaining) != null) {
                count += hm.get(remaining);
            }
            hm.put(xor, hm.getOrDefault(xor, 0) + 1); // keep track of frequency
        }
        System.out.println(count);
    }
}
