package com.corejava.Arrays;

import com.corejava.AskArrayInput;

public class SecondLargestBruteForceApproach {
    public static void main(String[] args) {
        int[] a = AskArrayInput.askIntegerArray();

        int largest = a[0];
        for(int x:a){
            if(x>largest){
                largest = x;
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for(int x:a){
            if(x>secondLargest && x!=largest){
                secondLargest = x;
            }
        }
        System.out.println(secondLargest);
    }
}
