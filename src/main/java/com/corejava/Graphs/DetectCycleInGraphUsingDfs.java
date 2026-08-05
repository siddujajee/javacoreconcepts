package com.corejava.Graphs;

import java.util.Scanner;

public class DetectCycleInGraphUsingDfs {
    public static void main(String[] args) {
        System.out.println("enter number of nodes");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("enter number of edges");
        int[][] graph = new int[n + 1][n + 1];
        int[] visited = new int[graph.length];
        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            int startingNode = scan.nextInt();
            int endingNode = scan.nextInt();

            graph[startingNode][endingNode] = 1;
            graph[endingNode][startingNode] = 1;
        }
        boolean hasCycle = false;
        for (int i = 0; i < graph.length; i++) {
            if (visited[i] != 1) {
                if (performDfs(graph, i, -1, visited)) {
                    System.out.println("this has a cycle");
                    hasCycle = true;
                    break;
                }
            }
        }
        if (hasCycle == false) {
            System.out.println("this graph doesn't have a cycle");
        }

    }

    public static boolean performDfs(int[][] graph, int node, int parent, int[] visited) {
        visited[node] = 1;
        for (int i = 1; i < graph.length; i++) {
            if (graph[node][i] == 1) {
                if (visited[i] == 1) {
                    if (i != parent) {
                        return true;
                    }
                } else {
                    if (performDfs(graph, i, node, visited)) {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
