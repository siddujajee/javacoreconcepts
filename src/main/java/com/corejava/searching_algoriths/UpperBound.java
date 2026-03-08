package com.corejava.searching_algoriths;

class UpperBound {
    public static int upperBound(int[] nums, int x) {
        int result = nums.length;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == x) {
                mid++;
                while (nums[mid] == x) {
                    mid++;
                }
                start = mid;
            } else if (nums[mid] > x) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 2, 3 };
        // int x = 2;
        int[] nums = { 3, 5, 8, 15, 19 };
        int x = 9;
        System.out.println(UpperBound.upperBound(nums, x));
    }
}
