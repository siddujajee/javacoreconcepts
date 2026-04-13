package com.corejava.collections.LinkedListExcercise.SinglyLinkedList;

import com.corejava.collections.LinkedListExcercise.InitialiseSingleLinkedList;
import com.corejava.collections.LinkedListExcercise.ListNode;

public class ConvertBinaryRepresentationToInteger {
    public static void main(String[] args) {
        int[] a = { 1, 0, 1 };
        ListNode head = InitialiseSingleLinkedList.getList(a);

        int result = convertToInteger(head);
        System.out.println("integer representation of binary data " + result);
    }

    public static int convertToInteger(ListNode head) {
        ListNode currentNode = head;
        int num = 0;
        while (currentNode != null) {
            num = (num * 2) + currentNode.value;
            currentNode = currentNode.next;
        }
        return num;
    }
}
