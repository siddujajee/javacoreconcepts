package com.corejava.Arrays;

import java.util.*;

class TrippletsOfArrayOptimalSolutionHelper {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) // it has to be if not while, as it can lead to infinite loop if
                                                 // condition is true ex: [0, 1, 1] at i = 2
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    ArrayList<Integer> tempList = new ArrayList<Integer>();
                    tempList.add(nums[i]);
                    tempList.add(nums[j]);
                    tempList.add(nums[k]);
                    result.add(tempList);
                    j++;
                    k--;
                    while (nums[j] == nums[j - 1])
                        j++;
                    while (nums[k] == nums[k + 1])
                        k--;
                }
            }
        }
        return result;
    }
}

public class TrippletsOfArrayOptimalSolution {
    public static void main(String[] args) {
        // int[] nums = { 0, 0, 0 }; // most important test case(it can throw array
        // - index out of bound exception at line while (nums[j] == nums[j - 1]))
        int[] nums = { 2, -2, 0, 3, -3, 5 };
        TrippletsOfArrayOptimalSolutionHelper helper = new TrippletsOfArrayOptimalSolutionHelper();
        List<List<Integer>> result = helper.threeSum(nums);
        System.out.println(result);
    }
}
