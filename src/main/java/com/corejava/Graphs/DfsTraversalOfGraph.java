package com.corejava.Graphs;

import java.util.List;

public class DfsTraversalOfGraph {
    public static void main(String[] args) {
        List<List<Integer>> graph = ImplementationOfGraph.getGraph("undirected");
        int initialNode = 1;
        int[] visited = new int[graph.size()];
        startTraversal(graph, initialNode, visited);
    }

    public static void startTraversal(List<List<Integer>> graph, int node, int[] visited) {
        visited[node] = 1;
        System.out.print(node + " ");
        for (Integer x : graph.get(node)) {
            if (visited[x] == 0) {
                startTraversal(graph, x, visited);
            }
        }
    }
}
