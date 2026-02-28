// Given an integer array nums. Return the number of inversions in the array.
// Two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
// It indicates how close an array is to being sorted.
// A sorted array has an inversion count of 0.
// An array sorted in descending order has maximum inversion.
package com.corejava.Arrays;

public class CountArrayInversion {
    public static long numberOfInversions(int[] nums) {
        long count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 7, 1, 3, 5 };
        // int[] nums = { -10, -5, 6, 11, 15, 17 };
        System.out.println(numberOfInversions(nums));
    }
}
