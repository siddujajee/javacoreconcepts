package com.corejava.Trees;

public class FindDiameter {
    static int height = 0;

    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.buildTree();

        findDiameter(root);
        System.out.println("Diameter of the tree is " + height);
    }

    public static int findDiameter(TreeNode root) {
        if (root == null)
            return 0;

        int lh = findDiameter(root.left);
        int rh = findDiameter(root.right);

        height = Integer.max(height, lh + rh);
        return 1 + Integer.max(lh, rh);
    }
}
