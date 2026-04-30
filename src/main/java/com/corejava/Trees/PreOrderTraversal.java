package com.corejava.Trees;

public class PreOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.buildTree();
        performTraversal(root);
    }

    public static void performTraversal(TreeNode root) {
        if (root == null)
            return;

        System.out.println(root.value);
        performTraversal(root.left);
        performTraversal(root.right);
    }
}
