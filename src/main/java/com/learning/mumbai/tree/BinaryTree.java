package com.learning.mumbai.tree;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


public class BinaryTree {
    Node root;

    BinaryTree(int data) {
        root = new Node(data);
    }

    void printUsingBFS(Node node) {
        Queue<Node> queue = new LinkedList<Node>();
        if (root == null)
            return;
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.print(" " + temp.data);
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
    }


    void printPostorder(Node node) {
        if (node == null) {
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    void printPreorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\n BFS - RIGHT TO LEFT ");
        tree.printUsingBFS(tree.root);

        System.out.println("\n Preorder traversal ");
        tree.printPreorder(tree.root);

        System.out.println("\n Inorder traversal ");
        tree.printInorder(tree.root);

        System.out.println("\n Postorder traversal ");
        tree.printPostorder(tree.root);

    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int value) {
        this.data = value;
    }
}




