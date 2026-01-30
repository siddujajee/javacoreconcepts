package com.corejava.Arrays;

import java.util.*;

class LongestSubArrayWithZeroSumSolution {
  public int maxLen(int[] arr) {
    // Your code goes here
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    int sum = 0;
    int longest = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum == 0) {
        longest = i + 1;
      } else {
        if (hm.get(sum) != null) {
          longest = Integer.max(longest, i - hm.get(sum));
        } else {
          hm.put(sum, i);
        }
      }

    }
    return longest;
  }
}

public class LongestSubArrayWithZeroSum {
  public static void main(String[] args) {
    // int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
    int[] arr = { 2, 10, 4 };
    LongestSubArrayWithZeroSumSolution s = new LongestSubArrayWithZeroSumSolution();
    System.out.println(s.maxLen(arr));
  }
}