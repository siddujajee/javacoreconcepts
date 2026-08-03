// leetcode: https://leetcode.com/problems/flood-fill/description/
package com.corejava.Graphs;

import java.util.ArrayDeque;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = new int[][] { { 0, 0, 0 }, { 0, 0, 0 } };
        int sr = 1;
        int sc = 0;
        int color = 2;
        int[][] result = floodFill(image, sr, sc, color);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int nodeColor = image[sr][sc];
        int[][] visited = new int[image.length][image[0].length];
        ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
        queue.offer(new int[] { sr, sc });
        visited[sr][sc] = 1;
        image[sr][sc] = color;
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int row = node[0];
            int col = node[1];

            if (row - 1 >= 0 && visited[row - 1][col] != 1 && image[row - 1][col] == nodeColor) {
                queue.offer(new int[] { row - 1, col });
                visited[row - 1][col] = 1;
                image[row - 1][col] = color;
            }
            if (row + 1 < image.length && visited[row + 1][col] != 1 && image[row + 1][col] == nodeColor) {
                queue.offer(new int[] { row + 1, col });
                visited[row + 1][col] = 1;
                image[row + 1][col] = color;
            }
            if (col - 1 >= 0 && visited[row][col - 1] != 1 && image[row][col - 1] == nodeColor) {
                queue.offer(new int[] { row, col - 1 });
                visited[row][col - 1] = 1;
                image[row][col - 1] = color;
            }
            if (col + 1 < image[0].length && visited[row][col + 1] != 1 && image[row][col + 1] == nodeColor) {
                queue.offer(new int[] { row, col + 1 });
                visited[row][col + 1] = 1;
                image[row][col + 1] = color;
            }
        }
        return image;
    }
}
