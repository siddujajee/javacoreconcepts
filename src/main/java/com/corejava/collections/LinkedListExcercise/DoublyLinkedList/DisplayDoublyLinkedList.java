package com.corejava.collections.LinkedListExcercise.DoublyLinkedList;

import com.corejava.collections.LinkedListExcercise.DisplayLinkedList;

public class DisplayDoublyLinkedList {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        DoublyLinkedNode head = InitialisingDoblyLinkedList.getList(a);
        DisplayLinkedList.displayDoublyLinkedList(head);
    }
}
