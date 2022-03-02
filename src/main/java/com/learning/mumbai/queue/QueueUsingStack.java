package com.learning.mumbai.queue;

import com.learning.mumbai.stack.Stack;

import java.util.NoSuchElementException;

public class QueueUsingStack {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void enqueue(int value) {
        if (stack2.isEmpty()) {
            stack1.push(value);
        } else {
            transfer(stack2, stack1);
            stack1.push(value);
        }
    }

    public int dequeue() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else if (!stack1.isEmpty()) {
            transfer(stack1, stack2);
            return stack2.pop();
        }
        throw new NoSuchElementException();
    }

    public void printQueue() {
        if (!stack2.isEmpty()) {
                 output();
        } else if (!stack1.isEmpty()) {
            transfer(stack1, stack2);
            output();
        } else {
            throw new NoSuchElementException();
        }
    }

    private void output() {
        while (!stack2.isEmpty()) {
            int value = stack2.pop();
            stack1.push(value);
            System.out.println(value);
        }
    }

    public static void transfer(Stack source, Stack destination) {
        while (!source.isEmpty()) {
            destination.push(source.pop());
        }
    }

    public static void main(String[] args) {
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enqueue(1);
        queueUsingStack.enqueue(2);
        queueUsingStack.enqueue(3);
        queueUsingStack.enqueue(4);
        queueUsingStack.enqueue(5);

        System.out.println(" -- Input -- ");
        queueUsingStack.printQueue();

        System.out.println("Remove element from queue: " + queueUsingStack.dequeue());
        System.out.println("Remove element from queue: " + queueUsingStack.dequeue());

        System.out.println(" -- Output after dequeue-- ");
        queueUsingStack.printQueue();

        queueUsingStack.enqueue(1);
        queueUsingStack.enqueue(2);

        System.out.println(" -- Output after enqueue -- ");
        queueUsingStack.printQueue();
    }
}
