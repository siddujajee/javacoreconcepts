// this will take a integer value from the user and returns nth element from fibonacci series
package com.corejava.Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fibo(n));
    }

    static int fibo(int n){
        if(n<=1){
            return n;
        }
        int last = fibo(n-1);
        int lastSecond = fibo(n-2);
        return last + lastSecond;
    }
}
