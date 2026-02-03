package com.corejava.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
  public static void main(String[] args) {
    List<List<Integer>> intervals = new ArrayList<>();
    intervals.add(List.of(1, 5));
    intervals.add(List.of(3, 6));
    intervals.add(List.of(8, 10));
    intervals.add(List.of(15, 18));
    List<List<Integer>> mergedIntervals = mergeOverlap(intervals);
    System.out.println(mergedIntervals);
  }

  public static List<List<Integer>> mergeOverlap(List<List<Integer>> intervals) {
    List<List<Integer>> result = new ArrayList<>();

    if (intervals == null || intervals.size() == 0)
      return result;

    intervals.sort((a, b) -> a.get(0) - b.get(0));

    List<Integer> temp = new ArrayList<>(intervals.get(0));

    for (int i = 1; i < intervals.size(); i++) {
      List<Integer> curr = intervals.get(i);

      if (curr.get(0) <= temp.get(1)) {
        temp.set(1, Math.max(temp.get(1), curr.get(1)));
      } else {
        result.add(temp);
        temp = new ArrayList<>(curr);
      }
    }

    result.add(temp);
    return result;
  }
}
