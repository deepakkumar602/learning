package com.learning.mumbai.stack;

import java.util.Scanner;

public class TowerOfHanoi {


    public static void main(String[] args) {

        System.out.println("Enter size of stack: ");
        int size = new Scanner(System.in).nextInt();
        StackUsingArray stack1 = new StackUsingArray(size);

        stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);

        System.out.println(" -- input -- ");
        stack1.printStack();

       // TowerOfHanoi toh = new TowerOfHanoi();
       // toh.towerOfHanoi(stack1, size);

        System.out.println(" -- stack1-- ");
        stack1.printStack();

    }
}

