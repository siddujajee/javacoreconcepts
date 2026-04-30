// example tree:
//         4
//        / \
//       1   7
//        \  /
//         3 6
package com.corejava.Trees;

public class ImplementationOfTree {
    public static Node buildTree() {
        // Build a complete binary tree with 1 as root:
        //    1
        //  /   \
        //  2     3
        // / \    / \
        // 4  5   6  7

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        return node1;
    }
}
