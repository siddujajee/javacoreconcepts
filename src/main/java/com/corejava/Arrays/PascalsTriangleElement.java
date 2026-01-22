package com.corejava.Arrays;

class PascalsTriangleElementSolution {
  public int factoriaOf(int k) {
    int fact = 1;
    for (int i = k; i > 0; i--) {
      fact = fact * i;
    }
    return fact;
  }
}

public class PascalsTriangleElement {
  public static void main(String[] args) {
    int row = 4;
    int col = 2;
    PascalsTriangleElementSolution solution = new PascalsTriangleElementSolution();
    int numerator = solution.factoriaOf(row - 1);
    int denominator = (solution.factoriaOf(col - 1)) * (solution.factoriaOf(row - col));
    System.out.println(numerator / denominator);
  }
}
