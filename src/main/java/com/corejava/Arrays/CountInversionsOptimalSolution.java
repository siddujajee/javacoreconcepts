package com.corejava.Arrays;

import java.util.ArrayList;

public class CountInversionsOptimalSolution {
    static long count = 0;

    public static void merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList al = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                al.add(nums[left]);
                left++;
            } else {
                count += (mid + 1 - left);
                al.add(nums[right]);
                right++;
            }
        }
    }

    public static long mergeSort(int[] nums, int low, int high) {
        if (low == high)
            return count;
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
        return count;
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 3, 7, 1, 3, 5 };
        int[] nums = { -10, -5, 6, 11, 15, 17 };
        System.out.println(mergeSort(nums, 0, nums.length - 1));
    }
}
