package com.corejava.Trees.BinarySearchTrees;

import com.corejava.Trees.ImplementationOfTree;
import com.corejava.Trees.InorderTraversal;
import com.corejava.Trees.TreeNode;

public class DeleteNode {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.createBinarySearchTree();
        int key = 30;

        System.out.println("before removal of node");
        InorderTraversal.performTraversal(root);
        System.out.println("after removal of node");
        TreeNode newRootNode = removeNode(root, key);
        InorderTraversal.performTraversal(newRootNode);
    }

    public static TreeNode removeNode(TreeNode root, int key) {
        if (root == null)
            return null;
        if (root.value == key) {
            return linkNode(root);
        }
        TreeNode node = root;
        while (node != null) {
            if (node.value > key) {
                if (node.left != null && node.left.value == key) {
                    node.left = linkNode(root.left);
                    break;
                } else {
                    node = node.left;
                }
            } else {
                if (node.right != null && node.right.value == key) {
                    node.right = linkNode(root.right);
                    break;
                } else {
                    node = node.right;
                }
            }
        }
        return root;
    }

    public static TreeNode linkNode(TreeNode node) {
        if (node.left == null)
            return node.right;
        if (node.right == null)
            return node.left;

        TreeNode rightNode = node.right;
        TreeNode extremeRightNode = findExtremeRightNode(node.left);
        extremeRightNode.right = rightNode;
        return node.left;
    }

    public static TreeNode findExtremeRightNode(TreeNode node) {
        if (node.right == null)
            return node;
        return findExtremeRightNode(node.right);
    }
}
