package com.learning.mumbai.linkedlist;

import java.util.Scanner;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[Value=" + value + "]";
    }

    public void add(int value) {
        Node node = this;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(value);
    }

    public Node add(int value, int pos) {
        if (pos == 0) {
            Node dummy = new Node(value);
            dummy.next = this;
            return dummy;
        }

        int position = 1;
        Node node1 = this;
        while (node1.next != null && position != pos) {
            node1 = node1.next;
            position++;
        }

        if (position == pos) {
            Node dummy = node1.next;
            node1.next = new Node(value);
            node1.next.next = dummy;
        }
        return this;
    }

    private static Node findMid(Node head) {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node getInputViaArray() {
        System.out.println("Enter the value of total elements:");
        int size = new Scanner(System.in).nextInt();

        Node node = null;

        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Value At Node " + i + " : ");
            int temp = new Scanner(System.in).nextInt();

            if (i == 0) {
                node = new Node(temp);
            } else {
                node.add(temp);
            }
        }
        return node;
    }

    public static Node getInputViaString() {
        System.out.println("Enter the linked list:");
        String linkedListString = new Scanner(System.in).nextLine();
        String[] splitString = linkedListString.split(",");

        Node head = null;
        for (String valueString : splitString) {
            int value = Integer.parseInt(valueString);
            if (head == null) {
                head = new Node(value);
            } else {
                head.add(value);
            }
        }
        return head;
    }

    public static int sizeOfLinkedList(Node node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public static void getOutputList(Node head) {
        Node node = head;
        boolean start = true;
        String prefix = "";
        while (node != null) {
            if (!start) {
                prefix = " -> ";
            } else {
                start = false;
            }
            System.out.print(prefix + node.value);
            node = node.next;
        }
        System.out.println();
    }

}