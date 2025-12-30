package com.corejava.Arrays;

import java.util.ArrayList;

class Solution {
    int[] unionOfArrays(int[] a, int[] b) {
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (!list.contains(a[i]))
                    list.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (!list.contains(a[i]))
                    list.add(a[i]);
                i++;
            } else {
                if (!list.contains(b[j]))
                    list.add(b[j]);
                j++;
            }
        }
        while (i < a.length) {
            if (!list.contains(a[i]))
                list.add(a[i]);
            i++;
        }

        while (j < b.length) {
            if (!list.contains(b[j]))
                list.add(b[j]);
            j++;
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }
}

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] a = { 3, 4, 6, 7, 9, 9 };
        int[] b = { 1, 5, 7, 8, 8 };
        Solution s = new Solution();
        int[] c = s.unionOfArrays(a, b);
        for (int x : c) {
            System.out.print(x + " ");
        }
    }

}
