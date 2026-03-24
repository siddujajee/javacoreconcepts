// link to problem: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
package com.corejava.searching_algoriths;

public class DaysToMakeBouquets {
    public static void main(String[] args) {
        int[] a = { 7, 7, 7, 7, 12, 7, 7 };
        int m = 2;
        int k = 3;
        System.out.println(minDays(a, m, k));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int start = minInAnArray(bloomDay);
        int end = maxInAnArray(bloomDay);

        int result = -1;
        if (bloomDay.length < (m * k))
            return -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            boolean possible = canMakeBouquet(bloomDay, mid, m, k);
            if (possible) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static boolean canMakeBouquet(int[] a, int days, int bouquets, int flowers) {
        int count = 0;
        int numberOfBouquets = 0;
        for (int x : a) {
            if (x <= days) {
                count++;
            } else {
                numberOfBouquets += (count / flowers);
                count = 0;
            }
        }
        numberOfBouquets += (count / flowers);
        return numberOfBouquets >= bouquets;
    }

    public static int minInAnArray(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int x : a) {
            min = Integer.min(min, x);
        }
        return min;
    }

    public static int maxInAnArray(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int x : a) {
            max = Integer.max(max, x);
        }
        return max;
    }
}
