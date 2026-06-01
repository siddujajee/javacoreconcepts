package com.corejava.Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepresentationOfGraphUsingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of nodes");
        int n = scan.nextInt();
        System.out.println("enter number of edges");
        int m = scan.nextInt();
        ArrayList<List<Integer>> graph = new ArrayList<List<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            System.out.println("enter the starting node");
            int startingNode = scan.nextInt();
            System.out.println("enter ending node");
            int endingNode = scan.nextInt();

            graph.get(startingNode).add(endingNode);
            graph.get(endingNode).add(startingNode);
        }
        scan.close();

        for (List<Integer> x : graph) {
            System.out.println(x);
        }
    }
}
