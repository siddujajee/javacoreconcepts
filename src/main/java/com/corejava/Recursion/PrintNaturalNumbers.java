package com.corejava.Recursion;

import java.util.Scanner;
class DisplayNaturalNumbers {
    // static int count = 1;
    // static void printNumbers(int n){
    //     while (count <= n) {
    //         System.out.println(count);
    //         count++;
    //         printNumbers(n);
    //     }
    // }

    static void printNumbers(int i, int n){
        if(i > n){
            return;
        } else {
            System.out.println(i);
            printNumbers(i+1, n);
        }
    }
}
public class PrintNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // DisplayNaturalNumbers.printNumbers(n);
        DisplayNaturalNumbers.printNumbers(1, n);
    }
}
