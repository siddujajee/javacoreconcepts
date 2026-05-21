// leetcode: https://leetcode.com/problems/validate-binary-search-tree/description/
package com.corejava.Trees.BinarySearchTrees;

import com.corejava.Trees.ImplementationOfTree;
import com.corejava.Trees.TreeNode;

public class IsItaBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.createBinarySearchTree();
        if (root == null) {
            System.out.println("given binary tree is binary search tree: true");
            return;
        }
        System.out.println("given binary is binary search tree: " + investigate(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }

    public static boolean investigate(TreeNode node, long minRange, long maxRange) {
        if (node == null)
            return true;

        if (node.value <= minRange || node.value >= maxRange) {
            return false;
        }

        return investigate(node.left, minRange, node.value) && investigate(node.right, node.value, maxRange);
    }
}
