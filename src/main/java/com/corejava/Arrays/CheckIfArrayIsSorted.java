package com.corejava.Arrays;
import com.corejava.AskArrayInput;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
       int[] a = AskArrayInput.askIntegerArray();
       for(int i=0;i<a.length-1;i++){
        if(a[i] > a[i+1]){
            System.out.println("is not a sorted array");
            return;
        }
       }
       System.out.println("is a sorted array");
    }
}
