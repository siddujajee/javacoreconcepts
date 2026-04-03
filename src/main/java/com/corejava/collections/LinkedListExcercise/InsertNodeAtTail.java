package com.corejava.collections.LinkedListExcercise;

public class InsertNodeAtTail {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 5 };
        int x = 10;

        ListNode head = InitialiseSingleLinkedList.getList(a);
        System.out.println("linked list before insertion of new node");
        DisplayLinkedList.display(head);
        insertNode(head, x);
        System.out.println("linked list after insertion of new node");
        DisplayLinkedList.display(head);
    }

    public static ListNode insertNode(ListNode head, int x){
        ListNode eleNode = new ListNode(x);
        ListNode currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = eleNode;
        return head;
    }
}
