package com.learning.mumbai.linkedlist;

import java.util.Scanner;

public class Partition {

    public Node partition(Node head, int x) {
        Node p1 = head;
        Node partitionNode = null;
        while (p1 != null && p1.value < x) {
            partitionNode = p1;
            p1 = p1.next;
        }

        if (p1 == null) {
            return head;
        }

        Node prev = null, temp = null;
        while (p1 != null) {
            if (p1.value >= x) {
                prev = p1;
                p1 = p1.next;
            } else {
                if (partitionNode != null) {
                    temp = partitionNode.next;
                    partitionNode.next = p1;
                } else {
                    temp = head;
                    head = p1;
                }
                partitionNode = p1;
                Node nextNode = p1.next;
                p1.next = temp;
                prev.next = nextNode;
                p1 = nextNode;
            }
        }
        return head;
    }


    public static void main(String[] args) {
        Node head = Node.getInputViaString();
        System.out.println("Enter the value to partition the linked list:");
        int partitionValue = new Scanner(System.in).nextInt();

        Partition pt = new Partition();
        Node newHead = pt.partition(head, partitionValue);

        System.out.println(" -- output -- ");
        Node.getOutputList(newHead);

    }
}
