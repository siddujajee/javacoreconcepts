package com.corejava.Trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class IterativeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.buildTree();
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        TreeNode node = root;
        stack.push(root);
        while (!stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                System.out.println(node.value);
                node = node.right;
            }
        }
    }
}
