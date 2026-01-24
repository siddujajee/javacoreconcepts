package com.corejava.Arrays;

import java.util.*;

public class MajorityElementsOptimal {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 1, 3, 2, 2 };
        System.out.println(majorityElementTwo(nums));
    }

    public static List<Integer> majorityElementTwo(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && nums[i] != element2) {
                element1 = nums[i];
                count1 = 1;
            } else if (count2 == 0 && nums[i] != element1) {
                element2 = nums[i];
                count2 = 0;
            } else if (nums[i] == element1) {
                count1++;
            } else if (nums[i] == element2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        int firstElementCount = 0;
        int secondElementCount = 0;
        for (int x : nums) {
            if (x == element1) {
                firstElementCount++;
            } else if (x == element2) {
                secondElementCount++;
            }
        }
        if (firstElementCount > (nums.length / 3)) {
            list.add(element1);
        }
        if (secondElementCount > (nums.length / 3)) {
            list.add(element2);
        }

        return list;
    }
}
