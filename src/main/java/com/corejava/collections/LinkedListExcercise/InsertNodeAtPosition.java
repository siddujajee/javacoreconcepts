package com.corejava.collections.LinkedListExcercise;

public class InsertNodeAtPosition {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int x = 10;
        int position = 3;

        ListNode head = InitialiseSingleLinkedList.getList(a);
        System.out.println("linked list before insertion of new node");
        DisplayLinkedList.display(head);
        insertNode(head, x, position);
        System.out.println("linked list after insertion of new node");
        DisplayLinkedList.display(head);
    }

    public static ListNode insertNode(ListNode head, int ele, int position) {
        if (position == 1) {
            return new ListNode(ele, head);
        }

        int count = 1;
        ListNode currentNode = head;
        while (currentNode != null) {
            if (count == position - 1) {
                break;
            }
            currentNode = currentNode.next;
            count++;
        }

        ListNode eleNode = new ListNode(ele, currentNode.next);
        currentNode.next = eleNode;
        return head;
    }
}
