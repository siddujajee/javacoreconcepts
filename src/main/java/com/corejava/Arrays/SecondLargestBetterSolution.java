package com.corejava.Arrays;

import java.util.Scanner;

public class SecondLargestBetterSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scan.nextInt();
        }

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
