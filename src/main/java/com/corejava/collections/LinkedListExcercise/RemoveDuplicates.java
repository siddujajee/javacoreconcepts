package com.corejava.collections.LinkedListExcercise;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // test case 1
        int[] a = { 1, 1, 2, 3, 3, 4 };

        // test case 2
        // int[] a = { 1, 1, 2, 3, 3 };

        // test case 3
        // int[] a = {};
        ListNode head = InitialiseSingleLinkedList.getList(a);
        ListNode newHead = remove(head);
        DisplayLinkedList.display(newHead);
    }

    public static ListNode remove(ListNode head) {
        if (head == null)
            return null;
        ListNode i = head;
        ListNode j = head.next;
        while (i != null && j != null) {
            if (i.value == j.value) {
                if (j.next == null) {
                    i.next = null;
                    break;
                }
                j = j.next;
            } else {
                i.next = j;
                i = j;
                j = j.next;
            }
        }
        return head;
    }
}