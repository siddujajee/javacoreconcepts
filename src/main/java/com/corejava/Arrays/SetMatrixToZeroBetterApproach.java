// in the previous approach time complexity was near about O(n^3) and in this approach time complexity is O(n^2) ignoring time complexity for printing the matrix.
package com.corejava.Arrays;

class SetMatrixToZeroBetterApproachSolution {
  public int[][] setZeroes(int[][] matrix) {
    // Your code goes here
    int m = matrix.length;
    int n = matrix[0].length;
    int[] row = new int[m];
    int[] column = new int[n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          row[i] = 1;
          column[j] = 1;
        }
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (row[i] == 1 || column[j] == 1) {
          matrix[i][j] = 0;
        }
      }
    }
    return matrix;
  }
}

public class SetMatrixToZeroBetterApproach {
  public static void main(String[] args) {
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
    SetMatrixToZeroBetterApproachSolution solution = new SetMatrixToZeroBetterApproachSolution();
    solution.setZeroes(matrix);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
