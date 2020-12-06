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
                        System.out.print("left append ");
                        parent.print();
                        parent.leftRamus = newNode;
                        return;
                    }
                } else {
                    current = current.rightRamus;
                    if (current == null) {
                        System.out.print("right append ");
                        parent.print();
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
        String l = "left ";
        String r = "right ";
        String trend = l;
        System.out.print(trend);

        if (root != null) {
            traversal(root.leftRamus);
            trend = r;
            System.out.print(trend);
            root.print();
            traversal(root.rightRamus);
        }
    }
    public Node getRoot() {
        return this.root;
    }

}
