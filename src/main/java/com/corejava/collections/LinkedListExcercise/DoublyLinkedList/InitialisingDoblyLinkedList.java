package com.corejava.collections.LinkedListExcercise.DoublyLinkedList;

public class InitialisingDoblyLinkedList {
    public static DoublyLinkedNode getList(int[] a) {
        DoublyLinkedNode head = new DoublyLinkedNode(a[0]);
        DoublyLinkedNode currentNode = head;
        for (int i = 1; i < a.length; i++) {
            DoublyLinkedNode tempNode = new DoublyLinkedNode(a[i], currentNode, null);
            currentNode.next = tempNode;
            currentNode = tempNode;
        }
        return head;
    }
}
