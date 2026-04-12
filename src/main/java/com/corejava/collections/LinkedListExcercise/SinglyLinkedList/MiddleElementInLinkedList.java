// leetcode: https://leetcode.com/problems/middle-of-the-linked-list/?envType=problem-list-v2&envId=linked-list
// point to be noted here is, if there are 2 middle elements return 2nd mid element. that's what last conditional statement is for
// referring to line: 25
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
