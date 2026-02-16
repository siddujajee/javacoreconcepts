// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.
// You can return the intervals in any order.
// Example 1

// Input: intervals = [[1,5],[3,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Intervals [1,5] and [3,6] overlap, so they are merged into [1,6].
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
