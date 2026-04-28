// example tree:
//         4
//        / \
//       1   7
//        \  /
//         3 6
package com.corejava.Trees;

public class ImplementationOfTree {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 6, 7 };
        Node node0 = new Node(a[0]);
        Node node1 = new Node(a[1]);
        Node node2 = new Node(a[2]);
        Node node3 = new Node(a[3]);
        Node node4 = new Node(a[4]);

        node2.left = node0;
        node2.right = node4;

        node1.right = node1;
        node4.left = node3;
    }
}
