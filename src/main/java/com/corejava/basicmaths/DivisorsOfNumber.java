package com.corejava.basicmaths;

import java.util.Scanner;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1;i*i<=n;i++){
            if(n%i == 0){
                System.out.print(i + " ");
                if(n/i != i){
                    System.out.print(n/i + " ");
                }
            }
        }
    }
    
}
