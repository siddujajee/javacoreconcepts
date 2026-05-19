package com.corejava.Trees.BinarySearchTrees;

import com.corejava.Trees.ImplementationOfTree;
import com.corejava.Trees.TreeNode;

public class KthLargestNode {
    static int result;
    static int counter;

    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.createBinarySearchTree();
        int k = 2;

        System.out.println("Kth largest element is " + findLargest(root, k));
    }

    public static int findLargest(TreeNode node, int k) {
        if (node == null)
            return 0;

        findLargest(node.right, k);
        counter++;
        if (counter == k) {
            result = node.value;
            return result;
        }
        findLargest(node.left, k);
        return result;
    }
}
