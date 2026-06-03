package com.corejava.Graphs;

public class DfsTraversalOnAdjacencyMatrix {
    public static void main(String[] args) {
        int[][] graph = { { 0, 0, 0, 0 }, { 0, 1, 1, 0 }, { 0, 1, 1, 1 }, { 0, 0, 1, 1 } };
        int node = 1;
        int[] visited = new int[graph.length];
        performDfs(graph, node, visited);
    }

    public static void performDfs(int[][] graph, int node, int[] visited) {
        System.out.println(node + " ");

        visited[node] = 1;
        for (int i = 1; i < graph.length; i++) {
            if (visited[i] == 0) {
                performDfs(graph, i, visited);
            }
        }
    }
}
