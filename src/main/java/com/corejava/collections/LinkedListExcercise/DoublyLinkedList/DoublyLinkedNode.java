package com.corejava.collections.LinkedListExcercise.DoublyLinkedList;

public class DoublyLinkedNode {
    public int value;
    public DoublyLinkedNode prev;
    public DoublyLinkedNode next;

    public DoublyLinkedNode(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    public DoublyLinkedNode(int value, DoublyLinkedNode prev, DoublyLinkedNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
