package com.corejava.Arrays;

import java.util.*;

public class GetQuadsBetterSolution {
  public static void main(String[] args) {
    // int[] nums = { 7, -7, 1, 2, 14, 3 }; // testcase 1
    // int[] nums = { 1, -2, 3, 5, 7, 9 }; // testcase 2
    // int target = 7;
    int[] nums = { -5, 5, 4, -3, 0, 0, 4, -2 };
    int target = 4;
    List<List<Integer>> list = getQuads(nums, target);
    System.out.println(list);
  }

  static List<List<Integer>> getQuads(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    HashSet<List<Integer>> resultSet = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      HashSet<Integer> tempSet = new HashSet<>();
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          int forthElement = target - (nums[i] + nums[j] + nums[k]);
          if (tempSet.contains(forthElement)) {
            List<Integer> tempList = new ArrayList<Integer>();
            tempList.add(nums[i]);
            tempList.add(nums[j]);
            tempList.add(nums[k]);
            tempList.add(forthElement);
            Collections.sort(tempList);
            resultSet.add(tempList);
          }
          tempSet.add(nums[k]);
        }
      }
    }

    for (List<Integer> quad : resultSet) {
      result.add(quad);
    }
    return result;
  }
}
