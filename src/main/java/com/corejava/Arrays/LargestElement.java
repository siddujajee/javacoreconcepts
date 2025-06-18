package com.corejava.Arrays;
import com.corejava.AskArrayInput;

public class LargestElement {

    public static void main(String[] args) {
        int[] a = AskArrayInput.askIntegerArray();

        int largest = a[0];
        for(int x:a){
           if(x > largest){
            largest = x;
           }
        }
        System.out.println(largest);
    }
}