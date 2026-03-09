package com.corejava.searching_algoriths;

public class FloorAndCeil {
    public static void main(String[] args) {
        // test case 1
        // int[] nums = { 3, 4, 4, 7, 8, 10 };
        // int x = 5;

        // test case 2
        int[] nums = { 3, 4, 4, 7, 8, 10 };
        int x = 8;
        int[] result = getFloorAndCeil(nums, x);
        System.out.println("floor: " + result[0] + " ceil: " + result[1]);
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[] { -1, -1 }; // floor, ceil
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == x) {
                return new int[] { nums[mid], nums[mid] };
            } else if (nums[mid] < x) {
                result[0] = nums[mid];
                start = mid + 1;
            } else {
                result[1] = nums[mid];
                end = mid - 1;
            }
        }
        return result;
    }
}
