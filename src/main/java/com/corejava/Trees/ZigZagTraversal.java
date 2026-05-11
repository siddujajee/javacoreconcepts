package com.corejava.Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.buildTree();

        List<List<Integer>> result = beginTraversal(root);
        System.out.println(result);
    }

    public static List<List<Integer>> beginTraversal(TreeNode node) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (node == null)
            return result;

        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(node);
        int iterator = 0;
        while (!queue.isEmpty()) {
            List<Integer> tempList = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode queueNode = queue.poll();
                if (iterator % 2 == 0) {
                    tempList.add(queueNode.value);
                } else {
                    tempList.add(0, queueNode.value);
                }

                if (queueNode.left != null)
                    queue.offer(queueNode.left);
                if (queueNode.right != null)
                    queue.offer(queueNode.right);
            }
            iterator++;
            result.add(tempList);
        }
        return result;
    }
}
