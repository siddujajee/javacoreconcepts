package com.corejava.Graphs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DetectCycleInUndirectedGraph {
    public static void main(String[] args) {
        System.out.println("enter number of nodes");
        Scanner scan = new Scanner(System.in);
        int nodes = scan.nextInt();
        System.out.println("enter number of edges");
        int edges = scan.nextInt();
        int[][] graph = new int[nodes + 1][nodes + 1];
        for (int i = 0; i < edges; i++) {
            int startingNode = scan.nextInt();
            int endingNode = scan.nextInt();

            graph[startingNode][endingNode] = 1;
            graph[endingNode][startingNode] = 1;
        }

        if (hasCycle(graph, 1)) {
            System.out.println("graph has cycle");
        } else {
            System.out.println("graph doesn't have the cycle");
        }
    }

    public static boolean hasCycle(int[][] graph, int node) {
        int[] visited = new int[graph.length];
        ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
        queue.offer(new int[] { node, -1 });
        visited[node] = 1;
        while (!queue.isEmpty()) {
            int[] nodeArr = queue.poll();
            int currentNode = nodeArr[0];
            int parent = nodeArr[1];

            for (int i = 1; i < graph.length; i++) {
                if (graph[currentNode][i] == 1) {
                    if (visited[i] != 1) {
                        queue.add(new int[] { i, currentNode });
                        visited[i] = 1;
                    } else if (i != parent) {
                        return true;
                    }
                }
            }
        }
        return false;

    }
}
