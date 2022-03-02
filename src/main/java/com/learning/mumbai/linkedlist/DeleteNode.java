package com.learning.mumbai.linkedlist;

public class DeleteNode {
    //Delete node when only given access to that node.
    public static void deleteAccessedNode(Node node)
    {
        if(node.next != null)
        {
            node.value = node.next.value;
            node.next = node.next.next;
        }
    }

    public static void main(String[] args) {

        Node node = Node.getInputViaArray();
        System.out.println(" -- Input --");
        Node.getOutputList(node);


       DeleteNode.deleteAccessedNode(node);

        System.out.println(" -- Output --");
        Node.getOutputList(node);
    }
}
