package com.corejava.collections.LinkedListExcercise.DoublyLinkedList;

import com.corejava.collections.LinkedListExcercise.DisplayLinkedList;

public class RemoveHeadOfLinkedList {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5 };
        DoublyLinkedNode head = InitialisingDoblyLinkedList.getList(a);
        System.out.println("before removing the head");
        DisplayLinkedList.displayDoublyLinkedList(head);

        System.out.println("after removing the head");
        DoublyLinkedNode newHead = removeHead(head);
        DisplayLinkedList.displayDoublyLinkedList(newHead);
    }

    public static DoublyLinkedNode removeHead(DoublyLinkedNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;

        head.next.prev = null;
        head = head.next;
        return head;
    }
}
