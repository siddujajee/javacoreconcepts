package com.corejava.Trees;

public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode rootNode = ImplementationOfTree.buildTree();
        performTraversal(rootNode);
    }

    public static void performTraversal(TreeNode root) {
        if (root == null)
            return;

        performTraversal(root.left);
        System.out.println(root.value);
        performTraversal(root.right);
    }
}
