// in simple words if we explain hashing means prestoring/prefetching
// ex: let's say you have an array and you are given a number and you are asked to return the number of times that number appeared in the array
// in this case i will create an array with length equals to maximum element of the array + 1(so that out of bound exception doesn't occur)
// i will store the count of apparition of each element in the appropriate index which will help me to fetch the number of apparitions of the given number
// below is just a example code complexity comes if you are given a multiple numbers and asked to print apparition of all those numbers
// refer Hashing.java program in current directory
package com.corejava.Hashing;

import java.util.Scanner;

public class FindingElementInAnArray {
    static int[] hash = new int[8];
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 5, 1, 7};
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        searchUsingHash(a, n);
    }

    static void searchUsingHash(int[] a, int n){
        for(int x: a){
            hash[x] = hash[x] + 1;
        }
        System.out.println(n + " appears " + hash[n] +" times in an array");
    }
}
