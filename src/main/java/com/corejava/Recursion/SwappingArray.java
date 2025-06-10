package com.corejava.Recursion;

import java.util.Arrays;

public class SwappingArray {
    static int temp;
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 4, 5};
        int i = 0;
        swap(a, i, a.length);
    }
    static void swap(int[] a, int  i, int n){
        if(i>=a.length/2){
            System.out.println("reverse array is: ");
            System.out.println(Arrays.toString(a));
            return;
        } else {
            temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
           swap(a, i+1, n); 
        }
    }
}
