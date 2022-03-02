package com.learning.mumbai.linkedlist;

public class Addition {

    public Node addTwoListRecursively(Node list1, Node list2) {

        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        int lengthOfList1 = Node.sizeOfLinkedList(list1);
        int lengthOfList2 = Node.sizeOfLinkedList(list2);

        if (lengthOfList1 < lengthOfList2) {
            int diff = lengthOfList2 - lengthOfList1;
            list1 = prefixZeroNodes(diff, list1);
        } else {
            int diff = lengthOfList1 - lengthOfList2;
            list2 = prefixZeroNodes(diff, list2);
        }

        return Addition.sum(list1, list2);
    }

    private Node prefixZeroNodes(int diff, Node list) {
        Node head = null;
        while (diff > 0) {
            head = new Node(0);
            head.next = list;
            list = head;
            diff--;
        }
        return list;
    }

    static Node sum(Node list1, Node list2) {
        Holder holder = sumLinkedList(list1, list2);
        if (holder.carry > 0) {
            Node head = new Node(holder.carry);
            head.next = holder.node;
            return head;
        }
        return holder.node;
    }

    static Holder sumLinkedList(Node list1, Node list2) {
        if (list1 == null) {
            return new Holder(null, 0);
        }

        Holder holder = sumLinkedList(list1.next, list2.next);

        int value = list1.value + list2.value + holder.carry;
        int carry = value / 10;
        value = value % 10;

        Node head = new Node(value);
        head.next = holder.node;

        return new Holder(head, carry);
    }

    public Node addTwoListIteratively(Node list1, Node list2) {
        Node head = null;
        Node currentNode = head;
        int carry = 0;

        while (list1 != null || list2 != null) {
            var sum = carry + (list1 == null ? 0 : list1.value) + (list2 == null ? 0 : list2.value);

            carry = sum / 10;
            sum %= 10;

            if (head == null) {
                head = new Node(sum);
                currentNode = head;
            } else {
                Node temp = new Node(sum);
                currentNode.next = temp;
                currentNode = temp;
            }

            if (list1 != null) {
                list1 = list1.next;
            }
            if (list2 != null) {
                list2 = list2.next;
            }
        }
        if (carry > 0) {
            currentNode.next = new Node(carry);
        }

        return head;
    }

    public static void main(String[] args) {
        System.out.println("Enter List 1");
        Node list1 = Node.getInputViaString();

        System.out.println("Enter List 2:");
        Node list2 = Node.getInputViaString();

        System.out.println("--Show List 1--");
        Node.getOutputList(list1);

        System.out.println("--Show List 2--");
        Node.getOutputList(list2);

        Addition add = new Addition();
        //Node newList = add.addTwoListIteratively(list1, list2);
        Node newList = add.addTwoListRecursively(list1, list2);
        //System.out.println("--Sum--");
        Node.getOutputList(newList);
    }
}

class Holder {
    Node node;
    int carry;

    public Holder(Node node, int carry) {
        this.node = node;
        this.carry = carry;
    }
}
