// time complexity = O(log10(n)) because we are dividing number by 10 n times
package com.corejava.basicmaths;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}