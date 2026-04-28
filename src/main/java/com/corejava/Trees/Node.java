package com.corejava.Trees;

public class Node {
    Node left;
    Node right;
    int value;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
