package com.corejava.collections.LinkedListExcercise;

public class IdentifyCycleInLinkedList {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        ListNode head = InitialiseSingleLinkedList.getList(a);
        // create a cycle from last node to 2nd node
        ListNode newHead = createCycle(head);
        isCyclic(newHead);
    }

    public static ListNode createCycle(ListNode head) {
        int counter = 1;
        ListNode currentNode = head;
        ListNode cyclicNode = null;
        while (currentNode != null) {
            if (counter == 2) {
                cyclicNode = currentNode;
            }
            if (currentNode.next == null) {
                currentNode.next = cyclicNode;
                break;
            }
            counter++;
            currentNode = currentNode.next;
        }
        return head;
    }

    public static void isCyclic(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while (fastPointer != null && fastPointer.next != null) {
            if (fastPointer == slowPointer) {
                System.out.println("list has a cycle in it");
                return;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        System.out.println("list doesn't have any cylcle in it");
    }

}
