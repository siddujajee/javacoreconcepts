package com.corejava.Recursion;

public class SwappingArray {
    static int temp;
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 4, 5};
        int i = 0;
        int j = a.length -1;
        swap(a, i, j);
    }
    static void swap(int[] a, int  i, int j){
        if(j <= i){
            System.out.println("reverse array is: ");
            for(int x: a){
                System.out.print(x + " ");
            }
            return;
        } else {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
           swap(a, i+1, j-1); 
        }
    }
}
