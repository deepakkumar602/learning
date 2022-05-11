package com.learning.mumbai.tree;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class BalancedTree {

    static boolean checkBalancedTree(Node root){
        int right = 0;
        int left = 0;

        if (root == null)
            throw new NoSuchElementException();

        if(root.left == null && root.right == null ){
            return true;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.remove();

            System.out.print(" " + temp.data);

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

        System.out.println("  left: " + left + "\n right: " + right);
        return true;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.printUsingBFS(tree.root);

        System.out.println("   ------   ");

        BalancedTree.checkBalancedTree(tree.root);
    }
}
