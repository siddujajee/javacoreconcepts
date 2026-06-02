package com.corejava.Graphs;

import java.util.ArrayList;
import java.util.List;

// Graph for ImplementationOfGraph.java:
// 1 - 2
// 1 - 6
// 2 - 3
// 2 - 4
// 4 - 5
// 5 - 8
// 1 - 6
// 6 - 7
// 6 - 9
// 7 - 8
// Exact edge order from connectNodes call sequence.
public class ImplementationOfGraph {
    public static String graphType;

    public static List<List<Integer>> getGraph(String type) {
        int nodes = 9;
        graphType = type;
        ArrayList<List<Integer>> graph = new ArrayList<List<Integer>>();

        for (int i = 0; i <= nodes; i++) {
            graph.add(new ArrayList<>());
        }

        connectNodes(graph, 1, 2);
        connectNodes(graph, 1, 6);
        connectNodes(graph, 2, 3);
        connectNodes(graph, 2, 4);
        connectNodes(graph, 4, 5);
        connectNodes(graph, 5, 8);
        connectNodes(graph, 1, 6);
        connectNodes(graph, 6, 7);
        connectNodes(graph, 6, 9);
        connectNodes(graph, 7, 8);

        return graph;
    }

    public static void connectNodes(List<List<Integer>> graph, int startingNode, int endingNode) {
        graph.get(startingNode).add(endingNode);
        if (graphType != "directed") {
            graph.get(endingNode).add(startingNode);
        }
    }
}
