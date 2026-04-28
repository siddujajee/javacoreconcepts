package com.corejava.Arrays;

import java.util.*;

public class GetQuadsOptimalSolution {
  public static void main(String[] args) {
    // int[] nums = { 7, -7, 1, 2, 14, 3 }; // testcase 1
    // int[] nums = { 1, -2, 3, 5, 7, 9 }; // testcase 2
    // int[] nums = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5 };
    // int[] nums = { 2, 2, 2, 2 };
    // int target = 8;
    // int[] nums = { 0, 0, 0, 0 };
    // int target = 0;
    // int[] nums = { -2, -1, -1, 1, 1, 2, 2 };
    // int target = 0;

    int[] nums = { 3, 1, 4, 2, -2, -1 };
    int target = 2;
    List<List<Integer>> list = getQuads(nums, target);
    System.out.println(list);
  }

  static List<List<Integer>> getQuads(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    HashSet<List<Integer>> resultSet = new HashSet<List<Integer>>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1; j < nums.length; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }
        int k = j + 1;
        int l = nums.length - 1;
        while (k <= l) {
          int sum = nums[i] + nums[j] + nums[k] + nums[l];
          if (sum > target) {
            l--;
          } else if (sum < target) {
            k++;
          } else {
            List<Integer> tempList = new ArrayList<Integer>();
            tempList.add(nums[i]);
            tempList.add(nums[j]);
            tempList.add(nums[k]);
            tempList.add(nums[l]);
            resultSet.add(tempList);
            k++;
            l--;
            while (l > 0 && nums[l] == target) {
              l--;
            }
            while (k < nums.length && nums[k] == target) {
              k++;
            }
          }
        }
      }
    }
    for (List<Integer> quad : resultSet) {
      result.add(quad);
    }
    return result;
  }
}
