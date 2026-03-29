package com.corejava.collections.LinkedListExcercise;

public class DisplayLinkedList {
    public static void display(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
