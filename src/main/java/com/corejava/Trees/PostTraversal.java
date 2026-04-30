package com.corejava.Trees;

public class PostTraversal {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.buildTree();
        performTraversal(root);
    }

    public static void performTraversal(TreeNode root) {
        if (root == null)
            return;

        performTraversal(root.left);
        performTraversal(root.right);
        System.out.println(root.value);
    }
}
