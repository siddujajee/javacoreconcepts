// Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
package com.corejava.searching_algoriths;

public class CapcityToShip {
    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }

    public static int shipWithinDays(int[] weights, int days) {
        long totalWeight = sumOfWeights(weights);
        long start = maxInArray(weights);
        long end = totalWeight;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (isPossible(weights, mid, days)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) start;
    }

    public static boolean isPossible(int[] weights, long target, int days) {
        long load = 0;
        int totalDays = 1;
        for (int x : weights) {
            if (load + x > target) {
                load = x;
                totalDays = totalDays + 1;
            } else {
                load += x;
            }
        }
        return totalDays <= days;
    }

    public static long sumOfWeights(int[] nums) {
        long totalWeight = 0;
        for (int x : nums) {
            totalWeight += x;
        }
        return totalWeight;
    }

    public static long maxInArray(int[] nums) {
        long max = Integer.MIN_VALUE;
        for (int x : nums) {
            max = Long.max(max, x);
        }
        return max;
    }
}
