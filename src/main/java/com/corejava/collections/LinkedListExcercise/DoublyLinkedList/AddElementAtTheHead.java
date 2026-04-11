package com.corejava.collections.LinkedListExcercise.DoublyLinkedList;

import com.corejava.collections.LinkedListExcercise.DisplayLinkedList;

public class AddElementAtTheHead {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 6 };
        int k = 3;
        DoublyLinkedNode head = InitialisingDoblyLinkedList.getList(a);
        System.out.println("linked list before adding a new node before head");
        DisplayLinkedList.displayDoublyLinkedList(head);

        DoublyLinkedNode newHead = addNewBeforeHead(head, k);
        System.out.println("linked list after adding a new node before head");
        DisplayLinkedList.displayDoublyLinkedList(newHead);
    }

    public static DoublyLinkedNode addNewBeforeHead(DoublyLinkedNode head, int k) {
        DoublyLinkedNode eleNode = new DoublyLinkedNode(k);
        if (head == null)
            return eleNode;
        head.prev = eleNode;
        eleNode.next = head;
        return eleNode;
    }
}
