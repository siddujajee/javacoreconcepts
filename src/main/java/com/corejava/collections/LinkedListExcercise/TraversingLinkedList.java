package com.corejava.collections.LinkedListExcercise;

class NewNode {
    int value;
    NewNode next;

    public NewNode(int value) {
        this.value = value;
        this.next = null;
    }

    public NewNode(int value, NewNode next) {
        this.value = value;
        this.next = next;
    }
}

public class TraversingLinkedList {
    public static void main(String[] args) {
        int[] a = { 2, 4, 5, 6 };
        NewNode head = new NewNode(a[0]);
        NewNode current = head;
        for (int i = 1; i < a.length; i++) {
            NewNode temp = new NewNode(a[i]);
            current.next = temp;
            current = temp;
        }

        printNode(head);

    }

    public static void printNode(NewNode head) {
        NewNode temp = head;
        while (temp != null) {
            System.out.println("this is reference to current Node " + temp);
            System.out.println("temp.value = " + temp.value);
            System.out.println("this is reference to next " + temp.next);
            temp = temp.next;
        }
    }
}
