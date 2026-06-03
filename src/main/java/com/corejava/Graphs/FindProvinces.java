package com.corejava.Graphs;

public class FindProvinces {
    public static void main(String[] args) {
        int[][] connectivity = { { 0, 0, 0, 0 }, { 0, 1, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 1 } };
        int provinces = 0;
        int[] visited = new int[connectivity.length];
        for (int i = 1; i < connectivity.length; i++) {
            if (visited[i] == 0) {
                provinces++;
                performDfs(connectivity, visited, i);
            }
        }
        System.out.println(provinces);
    }

    public static void performDfs(int[][] connectivity, int[] visited, int node) {
        visited[node] = 1;
        for (int i = 1; i < connectivity.length; i++) {
            if (connectivity[node][i] == 1 && visited[i] == 0) {
                performDfs(connectivity, visited, i);
            }
        }
    }
}
