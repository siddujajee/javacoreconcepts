package com.corejava.searching_algoriths;

import java.util.ArrayList;
import java.util.Arrays;

public class IdentifyNumberOfRotationsOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3)); // test case 1
        // ArrayList<Integer> a = (ArrayList<Integer>) Arrays.asList(3, 4, 5, 1, 2); //
        // test case 2
        // ArrayList<Integer> a = (ArrayList<Integer>) Arrays.asList(4, 5, 1, 2); //
        // test case 3
        System.out.println(findKRotation(a));
    }

    public static int findKRotation(ArrayList<Integer> nums) {
        int start = 0;
        int end = nums.size() - 1;
        int answer = 0;
        int min_value = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums.get(end) > nums.get(start)) {
                if (nums.get(start) < min_value) {
                    return start;
                }
            }
            if (nums.get(start) <= nums.get(mid)) {
                if (nums.get(start) < min_value) {
                    min_value = nums.get(start);
                    answer = start;
                }
                start = mid + 1;
            } else {
                if (nums.get(mid) < min_value) {
                    min_value = nums.get(mid);
                    answer = mid;
                }
                end = mid - 1;
            }

        }
        return answer;
    }
}
