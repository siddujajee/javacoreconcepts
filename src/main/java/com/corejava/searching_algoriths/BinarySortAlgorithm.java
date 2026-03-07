package com.corejava.searching_algoriths;

public class BinarySortAlgorithm {
  public static void main(String[] args) {
    int[] a = { 3, 4, 6, 7, 8, 9, 12, 16, 17 };
    int k = 12;

    int start = 0;
    int end = a.length - 1;
    int mid = (start + end) / 2;
    int result = beginSearch(a, k, start, end);
    if (result == -1) {
      System.out.println("element not found");
    } else {
      System.out.println(result);
    }
  }

  static int beginSearch(int[] a, int k, int start, int end) {
    int mid = (start + end) / 2;
    if (a[mid] == k) {
      return mid;
    } else if (a[mid] < k) {
      start = mid + 1;
    } else {
      end = mid - 1;
    }
    return -1;
  }
}
