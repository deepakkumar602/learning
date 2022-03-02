package com.learning.mumbai.linkedlist;

public class Palindrome {
    public static boolean isPalindrome(Node list1) {
        Node temp1 = list1;
        Node temp2 = ReverseLinkedList.reverseLinkedList(list1);

        while (temp1 != null) {
            if (temp1.value == temp2.value) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeUsingRecursively(Node head){
        return isPalindromeUsingRecursively(head, head) != null;
    }

    public static Node isPalindromeUsingRecursively(Node p1, Node p2) {
       //for odd no of elements
        if (p2.next == null) {
            return p1;
        }
        //for even no of elements
        if (p2.next.next == null) {
            return p1.next;
        }

        //call
        final Node comparisonNode = isPalindromeUsingRecursively(p1.next, p2.next.next);

        //processing
        if (comparisonNode != null && comparisonNode.value == p1.next.value ) {
            return comparisonNode.next;
        }

        return null;
    }

    public static void main(String... s) {
        Node head = Node.getInputViaString();
        Boolean result = isPalindromeUsingRecursively(head);

        if (result == true) {
            System.out.println(" -- Given LinkedList is Palindrome -- ");
        } else {
            System.out.println(" -- Given LinkedList is Not Palindrome -- ");
        }
    }

} 



