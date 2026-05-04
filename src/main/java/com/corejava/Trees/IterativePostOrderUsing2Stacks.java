package com.corejava.Trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class IterativePostOrderUsing2Stacks {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.buildTree();
        Deque<TreeNode> stack1 = new ArrayDeque<TreeNode>();
        Deque<TreeNode> stack2 = new ArrayDeque<TreeNode>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null)
                stack1.push(node.left);
            if (node.right != null)
                stack1.push(node.right);
        }

        for (TreeNode n : stack2) {
            System.out.println(n.value);
        }
    }
}
