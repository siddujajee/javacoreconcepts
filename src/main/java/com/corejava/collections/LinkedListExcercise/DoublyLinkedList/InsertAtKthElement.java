package com.corejava.collections.LinkedListExcercise.DoublyLinkedList;

import com.corejava.collections.LinkedListExcercise.DisplayLinkedList;

public class InsertAtKthElement {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 7 };
        int k = 3;
        DoublyLinkedNode head = InitialisingDoblyLinkedList.getList(a);
        System.out.println("doubly linked list before adding new node at kth position");
        DisplayLinkedList.displayDoublyLinkedList(head);

        DoublyLinkedNode newHead = addNewNode(head, k);
        System.out.println("doubly linked list after adding new node at kth position");
        DisplayLinkedList.displayDoublyLinkedList(newHead);
    }

    public static DoublyLinkedNode addNewNode(DoublyLinkedNode head, int k) {
        DoublyLinkedNode eleNode = new DoublyLinkedNode(k);
        DoublyLinkedNode currentNode = head;
        if (head == null)
            return eleNode;
        int count = 1;
        while (currentNode != null) {
            if (count == k - 1) {
                break;
            }
            currentNode = currentNode.next;
            count++;
        }
        currentNode.next.prev = eleNode;
        eleNode.next = currentNode.next;
        eleNode.prev = currentNode;
        currentNode.next = eleNode;
        return head;
    }
}
