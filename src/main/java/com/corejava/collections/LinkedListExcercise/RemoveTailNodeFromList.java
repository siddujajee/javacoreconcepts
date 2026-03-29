package com.corejava.collections.LinkedListExcercise;

public class RemoveTailNodeFromList {
    public static void main(String[] args) {
        int[] a = { 20, 4, 60, 30, 50 };
        ListNode head = InitialiseSingleLinkedList.getList(a);
        System.out.println("linked list before removal of tail");
        DisplayLinkedList.display(head);
        ListNode newHead = removeTail(head);
        System.out.println("linked list after removal of tail");
        DisplayLinkedList.display(newHead);

    }

    public static ListNode removeTail(ListNode head) {
        // if head or head.next is null then return null (empty linked list)
        if (head == null || head.next == null) {
            return null;
        }
        ListNode currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        return head;
    }
}
