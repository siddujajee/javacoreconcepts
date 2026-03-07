package com.corejava.searching_algoriths;

public class BinarySearchAlgorithm {
  public static void main(String[] args) {
    int[] a = { 3, 4, 6, 7, 8, 9, 12, 16, 17 };
    int k = 12;

    int start = 0;
    int end = a.length - 1;
    int mid = (start + end) / 2;
    while (start < end) {
      if (a[mid] == k) {
        System.out.println(mid);
        return;
      } else if (a[mid] < k) {
        start = mid + 1;
        mid = (start + end) / 2;
      } else {
        end = mid - 1;
        mid = (start + end) / 2;
      }
    }
    System.out.println("element not found");
  }
}
