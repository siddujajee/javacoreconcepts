package com.corejava.Arrays;

public class PrintRowOfPascalsTriangle {
  public static void main(String[] args) {
    int row = 4;
    int result = 1;
    System.out.print(result + " ");
    for (int i = 1; i < row; i++) {
      result = result * (row - i);
      result = result / i;
      System.out.print(result + " ");
    }
  }
}
