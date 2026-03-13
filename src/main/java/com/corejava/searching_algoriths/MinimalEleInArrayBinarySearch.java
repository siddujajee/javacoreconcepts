// the given array should be rotated sorted array
package com.corejava.searching_algoriths;

public class MinimalEleInArrayBinarySearch {
    public static void main(String[] args) {
        // int[] a = { 4, 5, 6, 7, 0, 1, 2 };
        int[] a = { 1, 2 };
        System.out.println(solution(a));
    }

    public static int solution(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int answer = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[start] < nums[end]) {
                answer = Integer.min(answer, nums[start]);
                break;
            }
            if (nums[mid] >= nums[start]) {
                answer = Integer.min(answer, nums[start]);
                start = mid + 1;
            } else {
                answer = Integer.min(answer, nums[mid]);
                end = mid - 1;
            }
        }
        return answer;
    }
}
