package com.corejava.Arrays;

import java.util.HashMap;

public class FindElementAppearingOnce {
    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 4, 5, 3, 4 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println("Element appearing once is: " + key);
                break;
            }
        }
    }
}
