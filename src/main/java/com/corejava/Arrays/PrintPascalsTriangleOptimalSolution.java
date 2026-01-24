// this is optimal solution to print pascals triangle with time complexity of O(n^2)
// refer PrintRowOfPascalsTriangle.java for better understanding of how each row is printed
package com.corejava.Arrays;

public class PrintPascalsTriangleOptimalSolution {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            int result = 1;
            System.out.print(result + " ");
            for (int j = 1; j < i; j++) {
                result = result * (i - j);
                result = result / j;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
