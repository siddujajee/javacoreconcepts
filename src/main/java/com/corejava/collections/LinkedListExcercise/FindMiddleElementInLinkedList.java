package com.corejava.collections.LinkedListExcercise;

public class FindMiddleElementInLinkedList {
    public static void main(String[] args) {
        ListNode head = InitialiseSingleLinkedList.getList(new int[] { 1, 2, 3, 4, 5 });
        int middleElement = findMiddleElement(head);
        System.out.println("Middle element of linked list is " + middleElement);
    }

    public static int findMiddleElement(ListNode head) {
        if (head == null)
            return -1;
        if (head.next == null)
            return head.value;
        ListNode oneStepPointer = head;
        ListNode twoStepPointer = head;
        while (twoStepPointer != null && twoStepPointer.next != null) {
            oneStepPointer = oneStepPointer.next;
            twoStepPointer = twoStepPointer.next.next;
        }
        return oneStepPointer.value;
    }
}
