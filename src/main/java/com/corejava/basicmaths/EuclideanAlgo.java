// this algo will reduce the time complexity to find gcd of 2 numbers
// it states gcd(a, b) = gcd(a-b, b) where a>b
// we can skip few subtraction steps by perfoming modulo on max number by min number repeat this till any of the number becomes 0 other element will be the gcd of 2 numbers
// ex: gcd(a, b) = gcd(a/b, b) ==> repeat this step till any of the element becomes 0, other element will be the gcd of 2 numbers
package com.corejava.basicmaths;

import java.util.Scanner;

public class EuclideanAlgo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("enter first number");
        int m = scan.nextInt();
        System.out.println("enter second number");
        int n = scan.nextInt();
        System.out.println(gcd(m, n));
    }

    static int gcd(int m, int n){
       while(m>0 && n>0){
            if(m > n) m = m%n; else n = n%m;
        }
        if(m ==0) return n; else return m;
    }
}
