package com.val.riazanski;

import java.util.NoSuchElementException;

public class Tree {
    //    fields
    private Node root;

    //    constructors
    public Tree() {
    }
    //    methods
    public void append(int key, Book content) {
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

}
