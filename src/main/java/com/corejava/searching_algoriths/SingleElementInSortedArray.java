package com.corejava.searching_algoriths;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        // test case 1
        int[] a = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        // test case 2
        // int[] a = {2};
        System.out.println(singleNonDuplicate(a));
    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 1;
        int end = nums.length - 2;
        if (nums.length == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2])
            return nums[nums.length - 1];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
