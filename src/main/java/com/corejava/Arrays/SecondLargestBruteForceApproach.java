package com.corejava.Arrays;

import java.util.Scanner;

public class SecondLargestBruteForceApproach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scan.nextInt();
        }

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
