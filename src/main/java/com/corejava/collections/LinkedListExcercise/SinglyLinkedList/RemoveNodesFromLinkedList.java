package com.corejava.collections.LinkedListExcercise.SinglyLinkedList;

import com.corejava.collections.LinkedListExcercise.DisplayLinkedList;
import com.corejava.collections.LinkedListExcercise.InitialiseSingleLinkedList;
import com.corejava.collections.LinkedListExcercise.ListNode;

public class RemoveNodesFromLinkedList {
    public static void main(String[] args) {
        int[] a = { 1, 2, 6, 3, 4, 5, 6 };
        int val = 6;
        ListNode head = InitialiseSingleLinkedList.getList(a);
        System.out.println("linked list before removing " + val);

        DisplayLinkedList.display(head);

        System.out.println("linked list after removing " + val);
        ListNode newHead = removeNodes(head, val);
        DisplayLinkedList.display(newHead);
    }

    public static ListNode removeNodes(ListNode head, int val) {
        ListNode dummyNode = new ListNode(-1);
        ListNode iteratorNode = dummyNode;
        ListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.next == null && currentNode.value == val) {
                iteratorNode.next = null;
            }

            if (currentNode.value != val) {
                iteratorNode.next = currentNode;
                iteratorNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        return dummyNode.next;
    }
}
