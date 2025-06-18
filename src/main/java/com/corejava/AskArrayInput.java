package com.corejava;

import java.util.Scanner;

public class AskArrayInput {
    public static int[] askIntegerArray(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scan.nextInt();
        }
        return a;
    }
}
