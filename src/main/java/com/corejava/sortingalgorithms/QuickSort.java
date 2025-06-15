package com.corejava.sortingalgorithms;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<=a.length-1;i++){
            a[i] = scan.nextInt();
        }
        int low = 0;
        int high = a.length-1;
        quickSorting(a, low, high);
        for(int x:a){
            System.out.print(x + " ");
        }
    }

    static void quickSorting(int[] a, int low, int high){
        int i = low;
        int j = high;
        if(i<j){
            int pivotIndex = findPivotIndex(a, low, high);
            quickSorting(a, low, pivotIndex-1);
            quickSorting(a, pivotIndex+1, high);
        }
    }

    static int findPivotIndex(int[] a, int low, int high){
        int pivotEle = a[low];
        int i = low;
        int j = high;
        while(i < j){
            while(a[i] <= pivotEle && i<=high){
                i++;
            }
            while(a[j] > pivotEle && j>=low){
                j--;
            }
            // swap the smallest and highest elements
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }        
        }

        // place the pivot element
        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;    
        return j;
    }
}
