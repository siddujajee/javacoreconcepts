package com.corejava.collections.LinkedListExcercise;

public class RemoveNodeFromList {
    public static void main(String[] args) {
        int[] a = { 10, 50, 40, 60 };
        ListNode head = InitialiseSingleLinkedList.getList(a);
        System.out.println(
                "======================= head information before removing node from head ======================");
        System.out.println("this is old head " + head);
        System.out.println("this is old head pointer to next node " + head.next);
        System.out.println("this is old head value " + head.value);

        System.out.println(
                "======================= head information after removing node from head ======================");
        ListNode newHead = removeHead(head);
        System.out.println("this is new head " + newHead);
        System.out.println("this is pointer to next node from head" + newHead.next);
        System.out.println("this is next header value " + newHead.value);
    }

    public static ListNode removeHead(ListNode head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }
}
