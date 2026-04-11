package com.corejava.collections.LinkedListExcercise.DoublyLinkedList;

import com.corejava.collections.LinkedListExcercise.DisplayLinkedList;

public class AppendNodeToTail {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 6 };
        int k = 4;
        DoublyLinkedNode head = InitialisingDoblyLinkedList.getList(a);
        System.out.println("doubly  linked list before appending node to the tail");
        DisplayLinkedList.displayDoublyLinkedList(head);

        DoublyLinkedNode newHead = appendNode(head, k);
        System.out.println("doubly linked list after appending node to the tail");
        DisplayLinkedList.displayDoublyLinkedList(newHead);

    }

    public static DoublyLinkedNode appendNode(DoublyLinkedNode head, int k) {
        if (head == null)
            return null;
        DoublyLinkedNode eleNode = new DoublyLinkedNode(k);
        if (head.next == null)
            return eleNode;
        DoublyLinkedNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = eleNode;
        eleNode.prev = currentNode;
        return head;
    }
}
