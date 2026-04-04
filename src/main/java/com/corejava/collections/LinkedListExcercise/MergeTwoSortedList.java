package com.corejava.collections.LinkedListExcercise;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        // test case 1
        // int[] list1 = { 1, 2, 4 };
        // int[] list2 = { 1, 3, 4 };

        // test case 2
        int[] list1 = {};
        int[] list2 = {};

        ListNode NodeList1 = InitialiseSingleLinkedList.getList(list1);
        ListNode NodeList2 = InitialiseSingleLinkedList.getList(list2);
        ListNode newHead = merge(NodeList1, NodeList2);
        DisplayLinkedList.display(newHead);
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;

        ListNode dummyNode = new ListNode(-1);
        ListNode iteratorNode = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.value > list2.value) {
                iteratorNode.next = list2;
                iteratorNode = list2;
                list2 = list2.next;
            } else {
                iteratorNode.next = list1;
                iteratorNode = list1;
                list1 = list1.next;
            }
        }

        while (list1 != null) {
            iteratorNode.next = list1;
            iteratorNode = list1;
            list1 = list1.next;
        }

        while (list2 != null) {
            iteratorNode.next = list2;
            iteratorNode = list2;
            list2 = list2.next;
        }

        return dummyNode.next;
    }
}
