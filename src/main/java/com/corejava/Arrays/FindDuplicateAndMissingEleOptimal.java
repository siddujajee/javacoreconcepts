package com.corejava.Arrays;

public class FindDuplicateAndMissingEleOptimal {
    public static void main(String[] args) {
        int[] nums1 = { 3, 5, 4, 1, 1 };
        int[] result = findMissingRepeatingNumbers(nums1);
        System.out.println("Duplicate number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }

    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        long sn = (n * (n + 1)) / 2;
        long sn2 = (n * (n + 1) * ((2 * n) + 1)) / 6;
        long s = 0;
        long s2 = 0;
        for (int i = 0; i < n; i++) {
            s += nums[i];
            s2 += nums[i] * nums[i];
        }
        long val1 = s - sn; // this is equivalent to x-y
        long val2 = s2 - sn2; // this is equivalent to x2 - y2
        val2 = val2 / val1; // this is equivalent to x+y
        long duplicate = (val1 + val2) / 2;
        long missing = duplicate - val1;
        return new int[] { (int) duplicate, (int) missing };
    }
}
