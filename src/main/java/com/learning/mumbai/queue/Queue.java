package com.learning.mumbai.queue;

import java.util.NoSuchElementException;

public class Queue {
    Node head;

    public void enqueue(int value) {
        if(head == null){
            head = new Node(value);
        }else{
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(value);
        }
    }

    public int dequeue() {
        if (head != null) {
            int value = head.value;
            head = head.next;
            return value;
        }
        throw new NoSuchElementException();
    }

    public void printQueue() {
        Node node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(" -- Input -- ");
        queue.printQueue();

        queue.dequeue();
        System.out.println(" -- Output -- ");
        queue.printQueue();
    }

}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}