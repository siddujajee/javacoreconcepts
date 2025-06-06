package com.corejava.basicmaths;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int copyOfN = n;
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum = sum + (lastDigit*lastDigit*lastDigit);
            n = n/10;
        }
        if(copyOfN == sum){
            System.out.println(copyOfN + " is an Armstrong number");
        } else {
            System.out.println(copyOfN + " is not an Armstrong number");
        }
    }
}
