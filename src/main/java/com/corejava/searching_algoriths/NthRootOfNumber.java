package com.corejava.searching_algoriths;

public class NthRootOfNumber {
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        System.out.println(findNthRoot(n, m));
    }

    public static int findNthRoot(int n, int m) {
        int start = 1;
        int end = m;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (getPower(mid, n) == m) {
                return mid;
            }
            if (getPower(mid, n) > m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int getPower(int num, int power) {
        int i = 0;
        int result = 1;
        while (i < power) {
            result = result * num;
            i++;
        }
        return result;
    }

}
