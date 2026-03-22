package com.corejava.searching_algoriths;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(findSquareRoot(n));
    }

    public static int findSquareRoot(int n) {
        int start = 0;
        int end = n;
        int answer = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return answer;
    }
}