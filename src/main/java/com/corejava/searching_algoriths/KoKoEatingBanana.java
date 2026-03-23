// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

// Example 1:

// Input: piles = [3,6,7,11], h = 8
// Output: 4
// Example 2:

// Input: piles = [30,11,23,4,20], h = 5
// Output: 30
package com.corejava.searching_algoriths;

public class KoKoEatingBanana {
  public static void main(String[] args) {
    int[] a = { 3, 6, 7, 11 };
    int k = 8;
    Solution s = new Solution();
    System.out.println(s.minEatingSpeed(a, k));
  }
}

class Solution {
  public int minEatingSpeed(int[] piles, int h) {
    int start = 1;
    int end = maxInArray(piles);
    int result = Integer.MAX_VALUE;
    while (start <= end) {
      int mid = (start + end) / 2;
      int numberOfHours = calculateNumberOfHours(piles, mid);
      if (numberOfHours <= h) {
        result = Integer.min(result, mid);
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return result;

  }

  public static int calculateNumberOfHours(int[] nums, int bananas) {
    int hours = 0;
    for (int x : nums) {
      hours += Math.ceil(((double) x) / (double) bananas);
    }
    return hours;
  }

  public static int maxInArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    for (int x : nums) {
      max = Integer.max(max, x);
    }

    return max;
  }
}
