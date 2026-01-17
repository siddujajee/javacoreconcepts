package com.corejava.Arrays;

import java.util.*;

class LeadersInAnArraySolution {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int min = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > min) {
                al.add(nums[i]);
                min = nums[i];
            }
        }
        Collections.reverse(al);
        return al;
    }
}

public class LeadersInAnArray {
    public static void main(String[] args) {
        // int[] a = { 1, 2, 5, 3, 1, 2 }; // test case 1
        int[] a = { -3, 4, 5, 1, -4, -5 }; // test case 2
        LeadersInAnArraySolution solution = new LeadersInAnArraySolution();
        List<Integer> leaders = solution.leaders(a);
        System.out.println(leaders);
    }
}
