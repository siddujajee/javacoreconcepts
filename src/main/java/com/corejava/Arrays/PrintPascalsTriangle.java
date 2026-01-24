package com.corejava.Arrays;

public class PrintPascalsTriangle {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(getElement(i, j) + " ");
            }
            System.out.println();
        }
    }

    static int getElement(int row, int column) {
        int result = 1;
        for (int i = 0; i < column; i++) {
            result = result * (row - i);
            result = result / (i + 1);
        }
        return result;
    }
}
