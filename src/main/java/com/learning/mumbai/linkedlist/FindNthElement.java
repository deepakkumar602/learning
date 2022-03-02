package com.learning.mumbai.linkedlist;
import java.util.Scanner;

public class FindNthElement {
    //find n-th node using size
    private static Node findNthToLast(Node node, int i)
    {
        if(i < 0)
        {
            System.out.println( i + " position not available in Linkedlist ");
            return null;
        }

        int size = Node.sizeOfLinkedList(node);
        if(size < i)
        {
            System.out.println( i + " position not available in Linkedlist ");
            return null;
        }

        int nthElement = size - i;
        int count = 0;

        while(node != null)
        {
            if(nthElement == count)
            {
                return node;
            }
            count++;
            node = node.next;
        }

        return null;
    }

    //find n-th node using two pointer
    private static Node findNthToLastTwoPointer(Node node, int i)
    {
        if(i < 0 && node == null)
        {
            System.out.println( i + " position not available in LinkedList:");
            return null;
        }

        Node p1 = node;
        Node p2 = node;
        int count = 0;

        while(p2 != null)
        {
            if(count < i)
            {
                p2 = p2.next;
                count++;
            }
            else
            {
                p1 = p1.next;
                p2 = p2.next;
            }
        }

        return p1;
    }

    public static void main(String[] args) {

        Node node = Node.getInputViaArray();

        System.out.println(" -- Input --");
        Node.getOutputList(node);

        System.out.println("Enter value to find the nth position value from last in Linkedlist");
        int nth = new Scanner(System.in).nextInt();

        Node nthNode = FindNthElement.findNthToLastTwoPointer(node, nth);

        System.out.println(" -- Output --");
        System.out.println("nth node is: " + nthNode);
    }
}
