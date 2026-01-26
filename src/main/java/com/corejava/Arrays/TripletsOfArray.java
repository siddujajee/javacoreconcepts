package com.corejava.Arrays;

import java.util.*;

class TripletsOfArraySolution {
    public List<List<Integer>> threeSum(int[] nums) {
        int sum = 0;
        List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        hs.add(temp);
                    }
                }
            }
        }
        for (List x : hs) {
            list.add(x);
        }
        return list;
    }
}

public class TripletsOfArray {
    public static void main(String[] args) {
        int[] nums = { 2, -2, 0, 3, -3, 5 };
        TripletsOfArraySolution s = new TripletsOfArraySolution();
        List<List<Integer>> list = s.threeSum(nums);
        System.out.println(list);
    }
}
