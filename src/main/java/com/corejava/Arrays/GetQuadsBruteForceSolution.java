// Given an integer array nums and an integer target. Return all quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
// a, b, c, d are all distinct valid indices of nums.

// nums[a] + nums[b] + nums[c] + nums[d] == target.

package com.corejava.Arrays;

import java.util.ArrayList;
import java.util.List;

public class GetQuadsBruteForceSolution {
    public static void main(String[] args) {
        // int[] nums = { 7, -7, 1, 2, 14, 3 }; // testcase 1
        int[] nums = { 2, -2, 0, 3, -3, 5 }; // testcase 2
        List<List<Integer>> list = getQuads(nums);
        System.out.println(list);
    }

    static List<List<Integer>> getQuads(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum == k) {
                            List<Integer> tempList = new ArrayList<Integer>();
                            tempList.add(nums[i]);
                            tempList.add(nums[j]);
                            tempList.add(nums[k]);
                            tempList.add(nums[l]);
                            result.add(tempList);
                        }
                    }
                }
            }
        }
        return result;
    }
}
