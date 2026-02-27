// Given an integer array nums of size n containing values from [1, n] and each value appears exactly once in the array, except for A, which appears twice and B which is missing.
// Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.
// Note: You are not allowed to modify the original array.
package com.corejava.Arrays;

public class FindDuplicateEleAndMissingEle {
    public static void main(String[] args) {
        // int[] nums = { 3, 5, 4, 1, 1 }; // test case 1
        int[] nums = { 1, 2, 3, 6, 7, 5, 7 }; // test case 2
        int[] result = findMissingRepeatingNumbers(nums);
        System.out.println("Duplicate number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }

    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int[] duplicate = new int[nums.length + 1];
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            duplicate[nums[i]] += 1;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (duplicate[i] == 2) {
                result[0] = i;
            }
            if (duplicate[i] == 0) {
                result[1] = i;
            }
        }
        return result;
    }
}
