package com.corejava.collections.LinkedListExcercise.SinglyLinkedList;

import com.corejava.collections.LinkedListExcercise.DisplayLinkedList;
import com.corejava.collections.LinkedListExcercise.InitialiseSingleLinkedList;
import com.corejava.collections.LinkedListExcercise.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        ListNode head = InitialiseSingleLinkedList.getList(a);
        System.out.println("linked list before reversing");
        DisplayLinkedList.display(head);

        ListNode newHead = reverseList(head);
        System.out.println("linked list after reversing");
        DisplayLinkedList.display(newHead);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }
}
