package com.corejava.searching_algoriths;

public class countOccurences {
    public static void main(String[] args) {
        // testCase1
        // int[] arr = { 0, 0, 1, 1, 1, 2, 3 };
        // int target = 1;

        // testCase2
        int[] arr = { 5, 5, 5, 5, 5, 5 };
        int target = 5;
        int result = countOccurencesSolution(arr, target);
        System.out.println(result);
    }

    public static int countOccurencesSolution(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                count++;
                while (start < mid && arr[start] != target) {
                    start++;
                }
                count += mid - start;
                while (end > mid && arr[end] != target) {
                    end--;
                }
                count += end - mid;
                return count;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return count;
    }
}
