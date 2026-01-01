// question: Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.
// example: if array is [0, 2, 3, 4] => missing number is 1
// example: if array is [1, 2, 3, 4] => missing number is 0
package com.corejava.Arrays;

class MissingElementSolver {
    public int findMissingElement(int[] a) {
        int n = a.length; // array contains numbers in range 0..n inclusive with one missing
        int sumOfNNaturalNumbers = (n * (n + 1)) / 2;
        int sumOfArrayElements = 0;
        for (int num : a) {
            sumOfArrayElements += num;
        }
        return (sumOfNNaturalNumbers - sumOfArrayElements);
    }

    public int findMissingElementXOR(int[] a) {
        int xor1 = 0;
        int xor2 = 0;
        // XOR all numbers from 0..n (where n = a.length)
        for (int i = 0; i <= a.length; i++) {
            xor1 = xor1 ^ i;
        }
        for (int num : a) {
            xor2 = xor2 ^ num;
        }
        return (xor1 ^ xor2);
    }
}

public class MissingElementInAnArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 5 };
        MissingElementSolver s = new MissingElementSolver();
        int missingNumber = s.findMissingElement(arr);
        System.out.println("missing number is: " + missingNumber);
        int missingNumberXOR = s.findMissingElementXOR(arr);
        System.out.println("missing number using XOR is: " + missingNumberXOR);
    }
}
