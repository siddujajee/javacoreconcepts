// problem statement: you are given an  array (in this case it's user input) and the number of iterations you need to perform which means for how many numbers you want a count
// and you are informed that maximum number in this array is 7, once user enters a number of which he wants a count we will be displaying it without iterating over array each time user enters a number
package com.corejava.Hashing;

import java.util.Scanner;
public class Hashing {
    static int[] hash = new int[8];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length of an array");
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }

        // prefetching the count and updating it in hash array
        for(int x:a){
            hash[x]++;
        }

        System.out.println("for how many numbers you want to check the count");
        int iterations = scan.nextInt();
        while(iterations > 0){
            int num = scan.nextInt();
            System.out.println(num + " appears " + hash[num] + " times in the array");
            iterations--;
        }
    }
}
