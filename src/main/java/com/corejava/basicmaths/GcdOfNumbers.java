// this will find the greatest common factor of given 2 numbers but worst case scenario is if there are no common factors,
// in this case loop will run till the smallest number, time complexity will be O(n)
// euclidean algo will fix this issue
package com.corejava.basicmaths;

import java.util.Scanner;

public class GcdOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("enter first number");
        int m = scan.nextInt();
        System.out.println("enter second number");
        int n = scan.nextInt();
        System.out.println(gcd(m, n));
    }

    public static int gcd(int m, int n){
        int smallest = smallest(m, n);
        for(int i = smallest;i>=2;i--){
            if(m%i == 0 && n%i == 0){
                return i;
            }
        }
        return 1;
    }

    public static int smallest(int m, int n){
        if(m>n) return n; else return m;
    }
}
