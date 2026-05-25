package com.Bit_manipulation;

public class SwapVariablesWithoutExtraVariable {
    public static void main(String[] args) {
        int a = 15;
        int b = 17;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
