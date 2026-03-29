package com.corejava.collections.LinkedListExcercise;

public class FindNodeOfElement {
    public static ListNode getNode(ListNode head, int value) {
        ListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
}
