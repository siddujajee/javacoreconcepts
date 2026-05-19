// link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
package com.corejava.Trees.BinarySearchTrees;

import com.corejava.Trees.ImplementationOfTree;
import com.corejava.Trees.TreeNode;

public class KthSmallestNode {
    static int result = -1;
    static int counter = 0;

    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.createBinarySearchTree();
        int k = 3;
        System.out.println("Kth smallest element is " + findSmallest(root, k));
    }

    public static int findSmallest(TreeNode root, int k) {
        if (root == null)
            return 0;

        findSmallest(root.left, k);
        counter++;
        if (counter == k) {
            result = root.value;
            return result;
        }
        findSmallest(root.right, k);
        return result;
    }
}
