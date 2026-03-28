// [10, 20, 40, 30] this is the given single linked list
package com.corejava.collections.LinkedListExcercise;

public class InsertNodeToHead {
    public static void main(String[] args) {
        int[] a = { 10, 20, 40, 30 };
        ListNode head = InitialiseSingleLinkedList.getList(a);
        System.out.println("==================Before Inserting new node at head====================");
        System.out.println("this is reference to head " + head);
        System.out.println("current head data = " + head.value);
        System.out.println("this is reference to next " + head.next);
        System.out.println("this is value of next " + head.next.value);

        System.out.println("========================= after inserting new node at the head ========================");
        int k = 5;
        head = insertAtHead(head, k);
        System.out.println("this is reference to head " + head);
        System.out.println("current head data = " + head.value);
        System.out.println("this is reference to next " + head.next);
        System.out.println("this is value of next " + head.next.value);
    }

    // Main method to insert the new node
    public static ListNode insertAtHead(ListNode head, int X) {
        // YOUR CODE GOES HERE
        ListNode newNode = new ListNode(X);
        newNode.next = head;
        return newNode;
    }
}
