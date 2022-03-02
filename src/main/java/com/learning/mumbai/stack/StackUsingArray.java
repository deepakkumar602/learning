package com.learning.mumbai.stack;

public class StackUsingArray {
    int[] arr;
    int count;

    public StackUsingArray(int size) {
        arr = new int[size];
    }

    public void push(int value) {
        if (count > 0) {
            if (count < arr.length && arr[count - 1] > value) {
                arr[count] = value;
                count++;
            }
        } else {
            if (count < arr.length) {
                arr[count] = value;
                count++;
            }
        }
    }

    public int pop() {
        if (count > 0) {
            count--;
            return arr[count];
        } else {
            return 0;
        }
    }

    public int peek(){
        if(count > 0){
            return arr[count-1];
        }
        return 0;
    }

    public void printStack() {
        int lastIndex = count - 1;
        for (int i = lastIndex; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        //System.out.println("Enter size of stack: ");
        //int size = new java.util.Scanner(System.in).nextInt();
        StackUsingArray list = new StackUsingArray(10);

        list.push(9);
        list.push(8);
        list.push(7);
        list.push(6);
        list.push(5);

        System.out.println(" -- input -- ");
        list.printStack();

        System.out.println(list.pop());

        System.out.println(" -- After pop -- ");
        list.printStack();

    }
}
