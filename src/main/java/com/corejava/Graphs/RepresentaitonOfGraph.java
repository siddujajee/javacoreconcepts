//  if graph is weighted graph to represent graph just mark the matrix cells with their respective weigts instead of 1
package com.corejava.Graphs;

import java.util.Scanner;

public class RepresentaitonOfGraph {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = scan.nextInt(); // nodes
        System.out.println("enter the number of edges");
        int m = scan.nextInt(); // edges
        int[][] graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            System.out.println("enter the starting node between 0 to " + n);
            int startNode = scan.nextInt();
            System.out.println("enter the ending node between 0 to " + n);
            int endNode = scan.nextInt();

            graph[startNode][endNode] = 1;
            graph[endNode][startNode] = 1;
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
        scan.close();
    }
}
