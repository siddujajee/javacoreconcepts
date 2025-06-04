package com.corejava.patterns;

public class InvertedPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*(5-i+1)+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
