// problem link: https://leetcode.com/problems/rotting-oranges/
package com.corejava.Graphs;

import java.util.ArrayDeque;
import java.util.Deque;

public class RottenOranges {
    public static void main(String[] args) {
        int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        System.out.println(findTime(grid));
    }

    public static int findTime(int[][] grid) {
        Deque<int[]> queue = new ArrayDeque<int[]>();
        int[][] visited = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[] { i, j, 0 });
                    visited[i][j] = 2;
                }
            }
        }

        int maxTime = 0;
        while (!queue.isEmpty()) {
            int[] ele = queue.poll();
            int row = ele[0];
            int column = ele[1];
            int time = ele[2];
            maxTime = Integer.max(time, maxTime);
            if (row - 1 >= 0 && visited[row - 1][column] != 2 && grid[row - 1][column] == 1) {
                queue.offer(new int[] { row - 1, column, time + 1 });
                visited[row - 1][column] = 2;
            }
            if (row + 1 < grid.length && visited[row + 1][column] != 2 && grid[row + 1][column] == 1) {
                queue.offer(new int[] { row + 1, column, time + 1 });
                visited[row + 1][column] = 2;
            }
            if (column - 1 >= 0 && visited[row][column - 1] != 2 && grid[row][column - 1] == 1) {
                queue.offer(new int[] { row, column - 1, time + 1 });
                visited[row][column - 1] = 2;
            }
            if (column + 1 < grid[0].length && visited[row][column + 1] != 2 && grid[row][column + 1] == 1) {
                queue.offer(new int[] { row, column + 1, time + 1 });
                visited[row][column + 1] = 2;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visited[i][j] != 2 && grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return maxTime;
    }
}
