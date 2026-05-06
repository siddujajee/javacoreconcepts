package com.corejava.Trees;

public class CheckBalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.createNonBalancedTree();
        boolean isBalanced = (heightOfTree(root) == -1) ? false : true;
        if (isBalanced) {
            System.out.println("given tree is a balanaced binary tree");
        } else {
            System.out.println("given tree is not balanced binary tree");
        }
    }

    public static int heightOfTree(TreeNode node) {
        if (node == null)
            return 0;

        int lh = heightOfTree(node.left);
        if (lh == -1)
            return -1;
        int rh = heightOfTree(node.right);
        if (rh == -1)
            return -1;

        if (Math.abs(lh - rh) > 1)
            return -1;

        return 1 + Math.max(lh, rh);
    }
}
