package com.corejava.collections.LinkedListExcercise;

import com.corejava.collections.LinkedListExcercise.DoublyLinkedList.DoublyLinkedNode;

public class DisplayLinkedList {
    public static void display(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void displayDoublyLinkedList(DoublyLinkedNode head) {
        DoublyLinkedNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
