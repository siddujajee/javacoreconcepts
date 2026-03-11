package com.corejava.searching_algoriths;

public class FindElementInAnRotatedArray {
    public static void main(String[] args) {
        int[] a = { 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3 };
        int k = 2;
        int result = findElementInRotatedArray(a, k);
        System.out.println(result);
    }

    public static int findElementInRotatedArray(int[] a, int k) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == k) {
                return mid;
            }
            // left half is sorted
            if (a[mid] >= a[start]) {
                if (k >= a[start] && k < a[mid]) {
                    // search in left half
                    end = mid - 1;
                } else {
                    // search in right half
                    start = mid + 1;
                }
            } else {
                // right half is sorted
                if (k > a[mid] && k <= a[end]) {
                    // search in right half
                    start = mid + 1;
                } else {
                    // search in left half
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
