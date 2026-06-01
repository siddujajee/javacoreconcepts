package com.corejava.Graphs;

import java.util.ArrayDeque;
import java.util.List;

public class BsfTraversalOfGraph {
    public static void main(String[] args) {
        List<List<Integer>> graph = ImplementationOfGraph.getGraph("undirected");
        startTraversal(graph, 1);
    }

    public static void startTraversal(List<List<Integer>> graph, int num) {
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        int[] markingArray = new int[graph.size()]; // since graph is 1 based graph array should be of size total nodes
                                                    // + 1;
        queue.offer(num);
        markingArray[num] = 1;
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.println(temp);
            for (Integer x : graph.get(temp)) {
                if (markingArray[x] == 0) {
                    queue.offer(x);
                    markingArray[x] = 1;
                }

            }
        }
    }
}
