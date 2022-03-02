package com.learning.mumbai.stack;

import java.util.Arrays;

public class ArrayPartitionsStack {
    int[] arr;
    int stackOneStart, stackOneEnd;
    int stackTwoStart, stackTwoEnd;
    int stackThirdStart, stackThirdEnd;


    public ArrayPartitionsStack(int totalSize) {
        if (totalSize == 0) {
            System.out.println("Size is to small");
            System.exit(0);
        }

        arr = new int[totalSize];
        if (totalSize == 1) {
            stackOneStart = 0;
            stackOneEnd = 1;
        }

        if (totalSize == 2) {
            stackOneStart = 0;
            stackOneEnd = stackTwoStart = 1;
            stackTwoEnd = 2;
        }

        if (totalSize >= 3) {
            int newSize = totalSize / 3;
            stackOneStart = 0;
            stackOneEnd = stackTwoStart = newSize;
            stackTwoEnd = stackThirdStart = newSize * 2;
            stackThirdEnd = totalSize;
        }
    }

    public boolean push(int stackNumber, int value) {
        if (stackNumber == 1 && stackOneStart < stackOneEnd) {
            arr[stackOneStart] = value;
            stackOneStart++;
            return true;
        }

        if (stackNumber == 2 && stackTwoStart < stackTwoEnd) {
            arr[stackTwoStart] = value;
            stackTwoStart++;
            return true;
        }

        if (stackNumber == 3 && stackThirdStart < stackThirdEnd) {
            arr[stackThirdStart] = value;
            stackThirdStart++;
            return true;
        }
        return false;
    }

    public boolean pop(int listNumber) {
        if (listNumber == 1 && stackOneStart > 0) {
            stackOneStart--;
            return true;
        }

        if (listNumber == 2 && stackTwoStart > stackOneEnd) {
            stackTwoStart--;
            return true;
        }

        if (listNumber == 3 && stackThirdStart > stackTwoEnd) {
            stackThirdStart--;
            return true;
        }
        return false;
    }

    public void printStack() {
        System.out.println(Arrays.toString(arr));
    }

    public void printStack(int listNumber) {
        if (listNumber == 1) {
            for (int i = stackOneStart - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }

        if (listNumber == 2) {
            for (int i = stackTwoStart - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }

        if (listNumber == 3) {
            for (int i = stackThirdStart - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(" Enter the total size of three Stack: ");
        int totalSize = new java.util.Scanner(System.in).nextInt();
        ArrayPartitionsStack arrayPartitionsStacks = new ArrayPartitionsStack(totalSize);

        InputStyle.input(arrayPartitionsStacks);
        arrayPartitionsStacks.printStack();
    }
}

class InputStyle {

    public static void input(ArrayPartitionsStack arrayPartitionsStacks) {
        boolean bExit = false;
        do {
            System.out.println("""
                    Chose Number For Operation:\s
                    Chose 1: For push element in stack\s
                    Chose 2: For pop element in stack\s
                    Chose 3: For print stack list\s
                    Chose 4: For exit\s""");

            int choice = new java.util.Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Enter the value for push in Stack: ");
                    int value = new java.util.Scanner(System.in).nextInt();
                    System.out.println(!arrayPartitionsStacks.push(InputStyle.listNumber(), value) ? " Stack overflow \n " : " Successfully pushed \n ");
                    break;
                case 2:
                    System.out.println(!arrayPartitionsStacks.pop(InputStyle.listNumber()) ? " Stack underflow \n " : " Successfully pop \n ");
                    break;
                case 3:
                    arrayPartitionsStacks.printStack(InputStyle.listNumber());
                    break;
                case 4:
                    bExit = true;
                    break;
                default:
                    System.out.println(" Oops: wrong choice ");
            }
        } while (!bExit);
    }

    public static int listNumber() {
        System.out.println("""
                Chose List For Operation:\s
                Chose 1: For stack 1\s
                Chose 2: For stack 2\s
                Chose 3: For stack 3\s""".indent(1));

        int choice = new java.util.Scanner(System.in).nextInt();

        switch (choice) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                System.out.println(" Oops: Wrong choice ");
                return 0;
        }
    }
}
