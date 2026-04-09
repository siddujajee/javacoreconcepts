package com.corejava.collections.LinkedListExcercise.DoublyLinkedList;

import com.corejava.collections.LinkedListExcercise.DisplayLinkedList;

public class InsertNodeAtTheHead {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int x = 4;
        DoublyLinkedNode head = InitialisingDoblyLinkedList.getList(a);
        System.out.println("list before inserting " + x + " at the head");
        DisplayLinkedList.displayDoublyLinkedList(head);

        System.out.println("list after inserting " + x + " at the head");
        DoublyLinkedNode newHead = insertNodeAtTheHead(head, x);
        DisplayLinkedList.displayDoublyLinkedList(newHead);
    }

    public static DoublyLinkedNode insertNodeAtTheHead(DoublyLinkedNode head, int x) {
        DoublyLinkedNode nodeOfEle = new DoublyLinkedNode(x);
        nodeOfEle.next = head;
        head.prev = nodeOfEle;
        return nodeOfEle;

    }
}
