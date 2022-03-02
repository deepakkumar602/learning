package com.learning.mumbai.stack;

public class Sort {
    public Stack stackSort(Stack mainStack) {
        Stack tempStack = new Stack();

        while (!mainStack.isEmpty()) {
            int temp = mainStack.peek();
            mainStack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                mainStack.push(tempStack.peek());
                tempStack.pop();
            }
            tempStack.push(temp);
        }
        return tempStack;
    }

    public static void main(String[] args) {
        Stack input = new Stack();
        input.push(5);
        input.push(2);
        input.push(8);
        input.push(1);

        System.out.println("--input--");
        input.printStack();

        System.out.println("After sort elements");

        Sort sort = new Sort();
        sort.stackSort(input).printStack();
    }
}
