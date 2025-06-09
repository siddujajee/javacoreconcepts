package com.corejava.Recursion;

import java.util.Scanner;

public class SumOfFirstNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sumOfN(n));
    }

    static int sumOfN(int n){
        if(n ==0){
            return 0;
        }
        return n + sumOfN(n-1);
    }
}
