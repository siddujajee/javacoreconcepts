package com.corejava.collections.LinkedListExcercise.SinglyLinkedList;

import com.corejava.collections.LinkedListExcercise.InitialiseSingleLinkedList;
import com.corejava.collections.LinkedListExcercise.ListNode;

public class MiddleElementInLinkedList {
    public static void main(String[] args) {
        // int[] a = { 1, 2, 3, 4, 5 };
        int[] a = { 1, 2, 3, 4, 5, 6 };
        ListNode head = InitialiseSingleLinkedList.getList(a);
        ListNode midNode = findMid(head);
        System.out.println(midNode.value);
    }

    public static ListNode findMid(ListNode head) {
        ListNode oneStepCounter = head;
        ListNode twoStepCounter = head.next;
        while (twoStepCounter != null && twoStepCounter.next != null) {
            oneStepCounter = oneStepCounter.next;
            twoStepCounter = twoStepCounter.next.next;
        }
        if (twoStepCounter == null)
            return oneStepCounter;
        return oneStepCounter.next;
    }
}
