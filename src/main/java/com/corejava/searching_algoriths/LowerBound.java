package com.corejava.searching_algoriths;

public class LowerBound {
  public static void main(String[] args) {
    int[] a = { 3, 5, 8, 15, 19 };
    int k = 55;
    int result = lowerBoundAlgorithm(a, k);
    System.out.println(result);
  }

  static int lowerBoundAlgorithm(int[] a, int k) {
    int start = 0;
    int end = a.length - 1;
    int result = a.length;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (a[mid] == k) {
        return mid;
      } else if (a[mid] < k) {
        start = mid + 1;
      } else {
        end = mid - 1;
        result = mid;
      }
    }
    return result;
  }
}