package com.corejava.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class TripletsOfArrayBetterSolution {
    public static void main(String[] args) {
        int[] nums = { 2, -2, 0, 3, -3, 5 };
        HashSet<ArrayList<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> tempSet = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int thirdElement = -(nums[i] + nums[j]);
                ArrayList<Integer> tempList = new ArrayList<>();
                if (tempSet.contains(thirdElement)) {
                    tempList.add(nums[i]);
                    tempList.add(nums[j]);
                    tempList.add(thirdElement);
                    Collections.sort(tempList);
                    resultSet.add(tempList);
                }
                tempSet.add(nums[j]);
            }

        }
        for (ArrayList<Integer> triplet : resultSet) {
            System.out.println(triplet);
        }
    }
}
