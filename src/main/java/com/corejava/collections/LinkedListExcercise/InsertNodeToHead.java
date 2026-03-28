// [10, 20, 40, 30] this is the given single linked list
package com.corejava.collections.LinkedListExcercise;

class ListNode {
    public int data;
    public ListNode next;

    ListNode() {
        data = 0;
        next = null;
    }

    ListNode(int x) {
        data = x;
        next = null;
    }

    ListNode(int x, ListNode next) {
        data = x;
        this.next = next;
    }
}

public class InsertNodeToHead {
    public static void main(String[] args) {
        int[] a = { 10, 20, 40, 30 };
        ListNode head = createHeadNode(a[0]);
        ListNode current = head;
        for (int i = 1; i < a.length; i++) {
            ListNode temp = new ListNode(a[i]);
            current.next = temp;
            current = temp;
        }

        int k = 5;
        System.out.println("this is reference to head before inserting new node " + head);
        head = insertAtHead(head, k);
        System.out.println("this is reference to head " + head);
        System.out.println("head.data = " + head.data);
        System.out.println("this is reference to next " + head.next);
    }

    public static ListNode createHeadNode(int x) {
        ListNode head = new ListNode(x);
        return head;
    }

    // Main method to insert the new node
    public static ListNode insertAtHead(ListNode head, int X) {
        // YOUR CODE GOES HERE
        ListNode newNode = new ListNode(X);
        newNode.next = head;
        return newNode;
    }
}
