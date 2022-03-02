package com.learning.mumbai.stack;

import jdk.jshell.EvalException;

import java.util.NoSuchElementException;

public class Stack {
    Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top != null) {
            int value = top.value;
            top = top.next;
            return value;
        }else {
            throw new NoSuchElementException();
        }
    }

    public void printStack() {
        Node node = top;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public int peek() {
        if (top != null) {
            return top.value;
        }
        return 0;
    }

    public boolean isEmpty() {
        if (top != null) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Stack list = new Stack();
        list.push(5);
        list.push(6);
        list.push(8);
        list.push(1);
        System.out.println("--input--");
        list.printStack();

        System.out.println(list.peek());
        list.pop();

        System.out.println("After pop one elements");
        list.printStack();

    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}
