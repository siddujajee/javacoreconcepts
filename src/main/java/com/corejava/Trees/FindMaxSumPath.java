package com.corejava.Trees;

public class FindMaxSumPath {
    static int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.buildTree();

        findMaxSum(root);
        System.out.println("Maximum sum path of the given tree is " + maxSum);
    }

    public static int findMaxSum(TreeNode node) {
        if (node == null)
            return 0;

        int leftMaxSum = Integer.max(0, findMaxSum(node.left)); // ignore -ve values
        int rightMaxSum = Integer.max(0, findMaxSum(node.right)); // ignore -ve values

        maxSum = Integer.max(maxSum, (node.value + leftMaxSum + rightMaxSum));

        return node.value + Integer.max(leftMaxSum, rightMaxSum);
    }
}
