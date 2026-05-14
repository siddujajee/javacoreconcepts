package com.corejava.Trees.BinarySearchTrees;

import com.corejava.Trees.ImplementationOfTree;
import com.corejava.Trees.InorderTraversal;
import com.corejava.Trees.TreeNode;

public class InsertNodeInBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.createBinarySearchTree();
        int val = 5;

        TreeNode resultNode = insertNode(root, val);
        InorderTraversal.performTraversal(resultNode);
    }

    public static TreeNode insertNode(TreeNode root, int val) {
        TreeNode eleNode = new TreeNode(val);
        if (root == null)
            return eleNode;

        TreeNode node = root;
        while (node.right != null || node.left != null) {
            if (node.value < val) {
                if (node.right == null) {
                    node.right = eleNode;
                    return root;
                }
                node = node.right;
            } else {
                if (node.left == null) {
                    node.left = eleNode;
                    return root;
                }
                node = node.left;
            }
        }
        if (node.value < val) {
            node.right = eleNode;
        } else {
            node.left = eleNode;
        }
        return root;
    }

}
