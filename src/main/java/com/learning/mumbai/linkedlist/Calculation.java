package com.learning.mumbai.linkedlist;

public class Calculation {

    public int sum(Node node) {
        if (node == null) {
            return 0;
        }
        return node.value + sum(node.next);
    }

    public static void main(String[] args) {

        System.out.println(" -- input -- ");
        Node list = Node.getInputViaArray();

        Calculation cl = new Calculation();
        int total = cl.sum(list);
        System.out.println(total);
    }
}
