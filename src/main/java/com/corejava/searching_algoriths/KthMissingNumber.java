// https://leetcode.com/problems/kth-missing-positive-number/description/
package com.corejava.searching_algoriths;

public class KthMissingNumber {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println(findKthMissingNumber(a, k));
    }

    public static int findKthMissingNumber(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}
