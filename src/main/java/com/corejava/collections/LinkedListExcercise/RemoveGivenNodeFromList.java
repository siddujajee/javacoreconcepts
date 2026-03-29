package com.corejava.collections.LinkedListExcercise;

public class RemoveGivenNodeFromList {
    public static void main(String[] args) {
        int[] a = { 10, 50, 40, 60 };
        ListNode head = InitialiseSingleLinkedList.getList(a);
        int k = 40;

        System.out.println("linked list before removing node with value " + k);
        DisplayLinkedList.display(head);

        ListNode nodeOfK = FindNodeOfElement.getNode(head, k);
        ListNode newHead = removeNode(head, nodeOfK);
        System.out.println("linked list after removing node with value " + k);
        DisplayLinkedList.display(newHead);
    }

    public static ListNode removeNode(ListNode head, ListNode nodeToRemove) {
        nodeToRemove.value = nodeToRemove.next.value;
        nodeToRemove.next = nodeToRemove.next.next;
        return head;
    }
}
