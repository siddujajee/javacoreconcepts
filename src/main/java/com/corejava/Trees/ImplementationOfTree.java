// example tree:
//         4
//        / \
//       1   7
//        \  /
//         3 6
package com.corejava.Trees;

public class ImplementationOfTree {
    public static TreeNode buildTree() {
        // Build a complete binary tree with 1 as root:
        //    1
        //  /   \
        //  2     3
        // / \    / \
        // 4  5   6  7

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        return node1;
    }

    public static TreeNode createNonBalancedTree() {
        // Create a right-skewed binary tree (non-balanced)
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        root.right.right.right.right = new TreeNode(5);
        return root;
    }

    public static TreeNode createBinarySearchTree() {
        // Create a sample binary search tree
        //        50
        //       /  \
        //      30   70
        //     / \   / \
        //    20 40 60 80

        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);
        return root;
    }

    
}
