// this is based on assumptions
// 1. if all the elements are positive then product of all the elements is the maximum product
// 2. if even negative numbers: maximum product is the product of all the elements
// 3. if odd negative numbers: maximum proudct is either at the prefix or at the suffix of the array. (prefix and suffix are defined by taking negative numbers as reference)
// 4. if there is zero in an array set prefix and suffix to 1 to start calculating product from the next element
package com.corejava.Arrays;

public class MaxProductSubArray {
  public static void main(String[] args) {
    // int[] a = { 4, 5, 3, 7, 1, 2 }; // test case 1
    int[] a = { -4, 0, -2 }; // test case 2
    System.out.println(maxProduct(a));
  }

  public static int maxProduct(int[] nums) {
    int prefix = 1;
    int suffix = 1;
    int maxProduct = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (prefix == 0)
        prefix = 1;
      if (suffix == 0)
        suffix = 1;

      prefix = prefix * nums[i];
      suffix = suffix * nums[nums.length - i - 1];
      maxProduct = Integer.max(maxProduct, Integer.max(prefix, suffix));
    }
    return maxProduct;
  }
}
