package com.corejava.collections.hashmap;

import java.lang.reflect.Array;
import java.util.HashMap;
class Solution {
    static HashMap<Integer, Integer> hm  = new HashMap<>();
    public static int mostFrequentElement(int[] nums) {
        int maxFrequency = 0;
        int element = nums[0];
        for(int i =0;i< nums.length;i++){
            int frequency = hm.getOrDefault(nums[i], 0)+1;
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
            if(frequency > maxFrequency){  // if(frequency >= maxFrequency)  if you want maximum number if multiple numbers have same apparitions
                maxFrequency = frequency;
                element = nums[i];
            }
        }
        return element;
        
    }
}

public class MaximumOccurrance {
    public static void main(String[] args) {
        int[] a = {1, 2, 4};
        System.out.println("element with maximum apparitions " + Solution.mostFrequentElement(a));
    }
}
