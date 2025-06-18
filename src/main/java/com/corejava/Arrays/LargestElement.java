package com.corejava.Arrays;

import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }

        int largest = a[0];
        for(int x:a){
           if(x > largest){
            largest = x;
           }
        }
        System.out.println(largest);
    }
}