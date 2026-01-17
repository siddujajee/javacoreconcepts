package com.corejava.Arrays;

class LongestConsecutiveSolution {
  public int longestConsecutive(int[] nums) {
    nums = sortAnArray(nums);
    int i = 0;
    int j = 1;
    int longest = Integer.MIN_VALUE;
    int count = 1;
    while (i < nums.length && j < nums.length) {
      if (nums[i] + 1 == nums[j]) {
        count++;
        i++;
        j++;
      } else {
        count = 1;
        i++;
        j++;
      }
      longest = Integer.max(longest, count);
    }
    return longest;
  }

  static int[] sortAnArray(int[] a) {
    for (int i = 0; i <= a.length - 2; i++) {
      for (int j = i + 1; j <= a.length - 1; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    return a;
  }
}

public class LongestConsecutiveElementsLength {

  public static void main(String[] args) {
    int[] a = { 100, 4, 200, 1, 3, 2 }; // test case 1
    // int[] a = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }; // test case 2
    LongestConsecutiveSolution solution = new LongestConsecutiveSolution();
    int length = solution.longestConsecutive(a);
    System.out.println(length);
  }
}