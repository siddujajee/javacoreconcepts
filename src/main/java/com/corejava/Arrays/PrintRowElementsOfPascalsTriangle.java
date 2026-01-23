package com.corejava.Arrays;

public class PrintRowElementsOfPascalsTriangle {
    public static void main(String[] args) {
        int r = 4;
        for (int i = 1; i <= r; i++) {
            System.out.print(getElement(r - 1, i - 1) + " ");
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
