package com.corejava.collections.LinkedListExcercise.DoublyLinkedList;

import com.corejava.collections.LinkedListExcercise.DisplayLinkedList;

public class RemoveTailOfTheLinkedList {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 6, 1 };
        DoublyLinkedNode head = InitialisingDoblyLinkedList.getList(a);
        System.out.println("list before removing tail of the doubly linked list");
        DisplayLinkedList.displayDoublyLinkedList(head);

        DoublyLinkedNode newHead = removeTail(head);
        System.out.println("list after removing tail of the doubly linked list");
        DisplayLinkedList.displayDoublyLinkedList(newHead);
    }

    public static DoublyLinkedNode removeTail(DoublyLinkedNode head) {
        if (head == null || head.next == null)
            return null;

        DoublyLinkedNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.prev.next = null;
                currentNode.prev = null;
            }
            currentNode = currentNode.next;
        }
        return head;
    }
}
