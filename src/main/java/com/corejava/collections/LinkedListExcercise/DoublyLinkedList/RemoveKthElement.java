package com.corejava.collections.LinkedListExcercise.DoublyLinkedList;

import com.corejava.collections.LinkedListExcercise.DisplayLinkedList;

public class RemoveKthElement {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 5, 6 };
        // int k = 5; // test case 1
        // int k = 1; // test case 2
        int k = 3; // test case 3
        DoublyLinkedNode head = InitialisingDoblyLinkedList.getList(a);
        System.out.println("doubly linked list before removing kth element");
        DisplayLinkedList.displayDoublyLinkedList(head);

        DoublyLinkedNode newHead = remove(head, k);
        System.out.println("doubly linked list after removing kth element");
        DisplayLinkedList.displayDoublyLinkedList(newHead);
    }

    public static DoublyLinkedNode remove(DoublyLinkedNode head, int k) {
        DoublyLinkedNode targetNode = head;
        int count = 1;
        if (head == null)
            return null;

        while (targetNode != null) {
            if (count == k) {
                break;
            }
            targetNode = targetNode.next;
            count++;
        }
        if (targetNode.next == null && targetNode.prev == null) {
            return null;
        } else if (targetNode.next == null) {
            targetNode.prev.next = null;
            targetNode.prev = null;
        } else if (targetNode.prev == null) {
            head = head.next;
        } else {
            targetNode.prev.next = targetNode.next;
            targetNode.next.prev = targetNode.prev;
        }
        return head;
    }
}
