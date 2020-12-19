package com.val.riazanski;

import java.util.NoSuchElementException;

public class Tree {
    //    fields
    private Node root;

    //    constructors
    public Tree() {
    }

//    static factory method
    public static Tree newEmptyTree() {
        return new Tree();
    }
    //    methods
    public void append(int key, String content) {
        Node newNode = new Node(key, content);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftRamus;
                    if (current == null) {
                        parent.leftRamus = newNode;
                        return;
                    }
                } else {
                    current = current.rightRamus;
                    if (current == null) {
                        parent.rightRamus = newNode;
                        return;
                    }
                }
            }
        }

    }

    public Node find(int key) {
        if (root == null) throw new NoSuchElementException("Tree is empty");
        Node current = root;
        while (current.key != key) {
            if (key < current.key) {
                current = current.leftRamus;
            } else {
                current = current.rightRamus;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void traversal(Node root) {
        int level = 0;
        System.out.print("\033[0;34m" + level + " nesting " + "\033[0m");

        if (root != null) {
            level++;
            System.out.print(level + " nesting ");
            traversal(root.leftRamus);
            root.print();
            traversal(root.rightRamus);
        }
    }

    public void traversalDecrease(Node root) {
        if (root != null) {
            traversalDecrease(root.rightRamus);
            root.print();
            traversalDecrease(root.leftRamus);
        }
    }
    public Node getRoot() {
        return this.root;
    }

}
