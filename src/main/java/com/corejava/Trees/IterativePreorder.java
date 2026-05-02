package com.corejava.Trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class IterativePreorder {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.buildTree();
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node.value);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
    }
}
