package com.Bit_manipulation;

import java.util.Scanner;

public class DecimalToBinary {
    public static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println("binary representation of " + num + " is " + convert(num));
        scan.close();
    }

    public static StringBuilder convert(int num) {
        if (num == 1)
            return ((result.append(1)).reverse());

        result = result.append(num % 2);
        num = num / 2;
        convert(num);
        return result;
    }
}
