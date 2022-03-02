package com.learning.mumbai.linkedlist;

public class ReverseLinkedList {
    public static Node reverseLinkedList(Node head) {
        Node node1 = head;
        Node previous = null, nextElem = null;

        while (node1 != null) {
            nextElem = node1.next;
            node1.next = previous;
            previous = node1;
            node1 = nextElem;
        }
        return previous;
    }

    public static void main(String[] args){

        Node node = Node.getInputViaArray();
        System.out.println(" -- Input --");
        Node.getOutputList(node);

        Node newNode = ReverseLinkedList.reverseLinkedList(node);

        System.out.println(" -- Output --");
        Node.getOutputList(newNode);
    }
}
