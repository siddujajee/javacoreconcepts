package com.corejava.Arrays;

// this program will retun the number of unique elemennts
import com.corejava.AskArrayInput;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = AskArrayInput.askIntegerArray();
        int i = 0;
        for(int j=1;j<a.length;j++){
            if(a[i] != a[j]){
                a[i+1] = a[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}
