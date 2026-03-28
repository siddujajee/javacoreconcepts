package com.corejava.collections.LinkedListExcercise;

public class InitialiseSingleLinkedList {
    public static ListNode getList(int[] a) {
        ListNode head = new ListNode(a[0]);
        ListNode currentNode = head;
        for (int i = 1; i < a.length; i++) {
            ListNode tempNode = new ListNode(a[i]);
            currentNode.next = tempNode;
            currentNode = tempNode;
        }
        return head;
    }
}
