package com.corejava.Arrays;

import com.corejava.AskArrayInput;

public class SecondLargestBetterSolution {
    public static void main(String[] args) {
        int[] a = AskArrayInput.askIntegerArray();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int x:a){
            if(x>largest){
                secondLargest = largest;
                largest = x;
            } else if(x>secondLargest && x<largest){
                secondLargest = x;
            }
        }
        if(secondLargest == Integer.MIN_VALUE) System.out.println("-1"); else System.out.println(secondLargest);;

        
    }    
}
