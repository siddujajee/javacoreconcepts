package com.corejava.Recursion;

import java.util.Scanner;
class DisplayNaturalNumbers {
    static int count = 1;
    static void printNumbers(int n){
        while (count <= n) {
            System.out.println(count);
            count++;
            printNumbers(n);
        }
    }
}
public class PrintNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        DisplayNaturalNumbers.printNumbers(n);
    }
}
