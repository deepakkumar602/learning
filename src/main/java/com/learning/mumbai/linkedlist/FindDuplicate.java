package com.learning.mumbai.linkedlist;

public class FindDuplicate {
    private static void checkDuplicateValue(Node node)
    {
        if(node == null && node.next == null)
        {
            System.out.println("There is no duplicate.");
        }

        while(node != null)
        {
            Node temp = node;
            while(temp.next != null) {
                if(node.value == temp.next.value)
                {
                    System.out.println("found Duplicate Value in LinkedList");
                }
                temp = temp.next;
            }
            node = node.next;
        }
        System.out.println("All Values Are Unique Values in LinkedList");
    }

    public static void main(String[] args) {

        Node node = Node.getInputViaArray();
        System.out.println(" -- Input --");

        Node.getOutputList(node);

        System.out.println(" -- Output --");

        FindDuplicate.checkDuplicateValue(node);


    }
}
