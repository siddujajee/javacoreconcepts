package com.corejava.Trees;

public class DepthOfTree {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.buildTree();

        int depth = findDepth(root);
        System.out.println("depth of the tree is " + depth);
    }

    public static int findDepth(TreeNode node) {
        if (node == null)
            return 0;

        int left = findDepth(node.left);
        int right = findDepth(node.right);

        return 1 + Math.max(left, right);
    }
}
