package com.corejava.Arrays;

class PascalsTriangleLocateElement {
    public int locateElement(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}

public class PascalsTriangleLocateElementBetterSolution {
    public static void main(String[] args) {
        int row = 5;
        int col = 3;
        PascalsTriangleLocateElement solution = new PascalsTriangleLocateElement();
        System.out.println(solution.locateElement(row - 1, col - 1));
    }
}
