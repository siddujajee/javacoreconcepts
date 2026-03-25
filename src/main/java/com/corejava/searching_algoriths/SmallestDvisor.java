package com.corejava.searching_algoriths;

public class SmallestDvisor {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 9 };
        int limit = 6;
        System.out.println(smallestDivisor(nums, limit));
    }

    public static int smallestDivisor(int[] nums, int limit) {
        int start = 1;
        int end = maxInArray(nums);
        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (isDivisor(nums, mid, limit)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static boolean isDivisor(int[] nums, int divisor, int target) {
        long sum = 0;
        for (int x : nums) {
            sum += Math.ceil((double) x / (double) divisor);
        }
        return sum <= target;
    }

    public static int maxInArray(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int x : a) {
            max = Integer.max(max, x);
        }
        return max;
    }
}
