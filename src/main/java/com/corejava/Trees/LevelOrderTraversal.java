package com.corejava.Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = ImplementationOfTree.buildTree();
        List<List<Integer>> result = performTraversal(root);
        for (List<Integer> x : result) {
            System.out.println(x);
        }
    }

    public static List<List<Integer>> performTraversal(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tempList = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);

                tempList.add(node.value);
            }
            result.add(tempList);
        }
        return result;
    }
}
