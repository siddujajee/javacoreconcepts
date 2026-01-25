package com.corejava.collections.LinkedListExcercise;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }
}

public class NodeBasedLinkedList {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5 };
    Node head = createLinkedListAndgetheader(a);
    System.out.println(head.data);
  }

  static Node createLinkedListAndgetheader(int[] a) {
    Node head = new Node(a[0]);
    Node current = head;
    for (int i = 1; i < a.length; i++) {
      Node temp = new Node(a[i]);
      current.next = temp;
      current = temp;
    }
    return head;
  }
}
