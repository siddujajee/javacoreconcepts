// Given an integer array nums. Return the number of reverse pairs in the array.
// An index pair (i, j) is called a reverse pair if:
// 0 <= i < j < nums.length
// nums[i] > 2 * nums[j]
package com.corejava.Arrays;

import java.util.ArrayList;

public class ReversePairsInArray {

  public static int countPairse(int[] nums, int low, int mid, int high) {
    int count = 0;
    int right = mid + 1;
    for (int i = low; i <= mid; i++) {
      while (right <= high && nums[i] > (2 * nums[right])) {
        right++;
      }
      count += (right - (mid + 1));
    }
    return count;
  }

  public static int reversePairs(int[] nums, int low, int high) {
    int count = 0;
    if (low >= high)
      return count;
    int mid = (low + high) / 2;
    count += reversePairs(nums, low, mid);
    count += reversePairs(nums, mid + 1, high);
    count += countPairse(nums, low, mid, high);
    merge(nums, low, mid, high);
    return count;
  }

  public static void merge(int[] nums, int low, int mid, int high) {
    int left = low;
    int right = mid + 1;
    ArrayList<Integer> tempList = new ArrayList<Integer>();
    while (left <= mid && right <= high) {
      if (nums[left] <= nums[right]) {
        tempList.add(nums[left]);
        left++;
      } else {
        tempList.add(nums[right]);
        right++;
      }
    }
    while (left <= mid) {
      tempList.add(nums[left]);
      left++;
    }
    while (right <= high) {
      tempList.add(nums[right]);
      right++;
    }
    for (int i = low; i <= high; i++) {
      nums[i] = tempList.get(i - low);
    }
  }

  public static void main(String[] args) {
    // int[] a = {4, 1, 2, 3, 1};
    int[] a = { 6, 4, 1, 2, 7 };
    System.out.println(reversePairs(a, 0, a.length - 1));
  }
}