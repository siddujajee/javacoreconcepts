package com.corejava.sortingalgorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = scan.nextInt();
        }

        for(int i=1;i<=a.length-1;i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && key < a[j]){
                if(a[j]>a[i]){
                    a[j+1] = a[j];
                    j--;

                }
            }
            a[j+1] = key;
        }
        for(int x: a){
            System.out.print(x + " ");
        }
    }
}
