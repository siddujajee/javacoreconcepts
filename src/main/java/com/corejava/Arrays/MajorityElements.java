// Given an integer array nums of size n. Return all elements which appear more than n/3 times in the array. The output can be returned in any order.
package com.corejava.Arrays;

import java.util.List;

import java.util.*;

class MajorityElementsSolution {
    public List<Integer> majorityElementTwo(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
            if (hm.get(x) > (nums.length / 3)) {
                list.add(x);
            }
        }

        return list;
    }
}

public class MajorityElements {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 1, 3, 2, 2 };
        MajorityElementsSolution s = new MajorityElementsSolution();
        List<Integer> list = s.majorityElementTwo(nums);
        System.out.println(list);
    }
}
