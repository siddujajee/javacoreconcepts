package com.corejava.Arrays;

import java.util.Arrays;

public class MergeArraysWithoutExtraSpace {
    public static void main(String[] args) {
        int[] nums1 = { -5, -2, 4, 5 };
        int[] nums2 = { -3, 1, 8 };
        merge(nums1, nums1.length, nums2, nums2.length);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        int j = 0;
        while (i >= 0 && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                break;
            } else {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i--;
                j++;
            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int iterator = 0;
        while (iterator < nums1.length) {
            System.out.print(nums1[iterator] + " ");
            iterator++;
        }
        iterator = 0;
        while (iterator < nums2.length) {
            System.out.print(nums2[iterator] + " ");
            iterator++;
        }
    }
}
