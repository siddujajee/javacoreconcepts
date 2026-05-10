// question: https://leetcode.com/problems/same-tree/
package com.corejava.Trees;

public class AreTreesIdentical {
    public static void main(String[] args) {
        TreeNode p = ImplementationOfTree.buildTree();
        TreeNode q = ImplementationOfTree.buildTree();

        if (areTreesIdentical(p, q) == true) {
            System.out.println("trees are identical");
        } else {
            System.out.println("trees aren't identical");
        }
    }

    public static boolean areTreesIdentical(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return p == q;
        }

        return p.value == q.value && areTreesIdentical(p.left, q.left) && areTreesIdentical(p.right, q.right);
    }
}
