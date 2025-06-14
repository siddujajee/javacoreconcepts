package com.corejava.sortingalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        mergeSorting(a, 0, a.length-1);
        for(int x: a){
            System.out.print(x + " ");
        }
    }

    static void mergeSorting(int[] a, int low, int high){
        if(low==high){
            return;
        }
        int mid = (low+high)/2;
        mergeSorting(a, low, mid);
        mergeSorting(a, mid+1, high);
        mergeArray(a, low, mid, high);
    }

    static void mergeArray(int[] a, int low, int mid, int high){
        ArrayList al = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left <= mid && right <= high) {
            if(a[left] <= a[right]){
                al.add(a[left]);
                left++;
            } else {
                al.add(a[right]);
                right++;
            }
        }
        while(left<=mid){
            al.add(a[left]);
            left++;
        }
        while(right<=high){
            al.add(a[right]);
            right++;
        }

        for (int i = 0; i < al.size(); i++) {
            a[low + i] = (int) al.get(i); // Cast is needed since al is a raw ArrayList
        }

    }
}
