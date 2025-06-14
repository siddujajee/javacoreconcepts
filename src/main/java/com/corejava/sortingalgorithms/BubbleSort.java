package com.corejava.sortingalgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scan.nextInt();
        }
        for(int j=0;j<a.length-1;j++){
            for(int i=0;i<a.length-1;i++){
                if(a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        for(int x: a){
            System.out.print(x+ " ");
        }
    }
}
