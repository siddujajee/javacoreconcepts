package com.corejava.Trees.BinarySearchTrees;

import com.corejava.Trees.ImplementationOfTree;
import com.corejava.Trees.TreeNode;

public class SearchNode {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.createBinarySearchTree();
        int val = 40;
        TreeNode result = findNode(root, val);
        if (result != null) {
            System.out.println("Node with value " + result.value + " found");
        } else {
            System.out.println("Node isn't present");
        }
    }

    public static TreeNode findNode(TreeNode root, int val) {
        if (root == null)
            return null;

        while (root != null) {
            if (root.value == val) {
                return root;
            } else if (root.value < val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return null;
    }
}
