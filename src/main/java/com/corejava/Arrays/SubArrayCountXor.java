package com.corejava.Arrays;

import java.util.HashMap;

public class SubArrayCountXor {
  public static void main(String[] args) {
    int[] a = { 4, 2, 2, 6, 4 };
    int k = 6;
    subAfrrayWithXorK(a, k);
  }

  public static void subAfrrayWithXorK(int[] nums, int k) {
    int xor = 0;
    int count = 0;
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      xor = xor ^ nums[i];
      if (xor == k) {
        count++;
      }
      if (nums[i] == k) {
        count++;
      }

      int remaining = xor ^ k;
      if (hm.get(remaining) != null) {
        count++;
      }
      hm.put(xor, i);
    }
    System.out.println(count);
  }
}
