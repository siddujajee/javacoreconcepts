// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0. You must do it in place.

// Example 1
// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
// Explanation:
// Element at position (1,1) is 0, so set entire row 1 and column 1 to 0.

package com.corejava.Arrays;

class SetMatrixToZeroSolution {
  public void setZeroes(int[][] matrix) {
    // Your code goes here
    int m = matrix.length;
    int n = matrix[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          markRow(matrix, i);
          markColumn(matrix, j);
        }
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == -1) {
          matrix[i][j] = 0;
        }
      }
    }
  }

  static int[][] markRow(int[][] a, int row) {
    for (int i = 0; i < a[0].length; i++) {
      if (a[row][i] != 0) {
        a[row][i] = -1;
      }
    }
    return a;
  }

  static int[][] markColumn(int[][] a, int column) {
    for (int i = 0; i < a.length; i++) {
      if (a[i][column] != 0) {
        a[i][column] = -1;
      }
    }
    return a;
  }
}

public class SetMatrixToZero {
  public static void main(String[] args) {
    SetMatrixToZeroSolution solution = new SetMatrixToZeroSolution();
    // int[][] matrix = { test case 1
    // { 1, 1, 1 },
    // { 1, 0, 1 },
    // { 1, 1, 1 }
    // };
    int[][] matrix = { // test case 2
        { 0, 1, 2, 0 },
        { 3, 4, 5, 2 },
        { 1, 3, 1, 5 }
    };
    solution.setZeroes(matrix);
    // Print the modified matrix
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
