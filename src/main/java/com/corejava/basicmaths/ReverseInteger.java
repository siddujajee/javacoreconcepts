package com.corejava.basicmaths;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(ReverseInteger.reverse(n));
    }
    public static int reverse(int x) {
        long reverse = 0;
        while(x>0 || x<0){
            int ld = x%10;
            reverse = reverse*10 + ld; 
            x = x/10;
            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
        }
        
            return (int)reverse;
    
    }
}
