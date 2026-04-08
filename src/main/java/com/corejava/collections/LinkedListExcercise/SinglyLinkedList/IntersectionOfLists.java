package com.corejava.collections.LinkedListExcercise.SinglyLinkedList;

import com.corejava.collections.LinkedListExcercise.DisplayLinkedList;
import com.corejava.collections.LinkedListExcercise.InitialiseSingleLinkedList;
import com.corejava.collections.LinkedListExcercise.ListNode;

public class IntersectionOfLists {
    public static void main(String[] args) {
        int[] a = { 4, 1, 8, 4, 5 };
        int[] b = { 5, 6, 1, 8, 4, 5 };
        ListNode headA = InitialiseSingleLinkedList.getList(a);
        ListNode headB = InitialiseSingleLinkedList.getList(b);
        createIntersection(headA, headB, 1);
        System.out.println("linked list A");
        DisplayLinkedList.display(headA);
        System.out.println("linked list B");
        DisplayLinkedList.display(headB);

        ListNode intersectionNode = findIntersectionNode(headA, headB);
        if (intersectionNode != null) {
            System.out.println("intersection node is " + intersectionNode.value);
        } else {
            System.out.println("intersection node does not exist");
        }
    }

    public static void createIntersection(ListNode headA, ListNode headB, int pos) {
        ListNode currentNodeA = headA;
        ListNode currentNodeB = headB;
        while (currentNodeA != null && currentNodeB != null) {
            if (currentNodeA.value == pos) {
                break;
            }
            currentNodeA = currentNodeA.next;
        }

        while (currentNodeB.next != null) {
            if (currentNodeB.next.value == pos) {
                currentNodeB.next = currentNodeA;
                break;
            }
            currentNodeB = currentNodeB.next;
        }
    }

    public static ListNode findIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        int lengthA = 0;
        int lengthB = 0;
        ListNode currentNodeA = headA;
        ListNode currentNodeB = headB;
        while (currentNodeA != null) {
            lengthA++;
            currentNodeA = currentNodeA.next;
        }

        while (currentNodeB != null) {
            lengthB++;
            currentNodeB = currentNodeB.next;
        }
        currentNodeA = headA;
        currentNodeB = headB;

        if (lengthA > lengthB) {
            int diff = lengthA - lengthB;
            while (diff > 0) {
                currentNodeA = currentNodeA.next;
                diff--;
            }
        } else {
            int diff = lengthB - lengthA;
            while (diff > 0) {
                currentNodeB = currentNodeB.next;
                diff--;
            }
        }

        while (currentNodeA != null && currentNodeB != null) {
            if (currentNodeA == currentNodeB) {
                return currentNodeA;
            }
            currentNodeA = currentNodeA.next;
            currentNodeB = currentNodeB.next;
        }
        return null;
    }

}
