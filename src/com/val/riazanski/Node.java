package com.val.riazanski;

import java.util.NoSuchElementException;

public class Node {
    //    fields
    int key;
    String content;
    Node leftRamus;
    Node rightRamus;
//    constructors
    public Node() {
    }
    public Node(int key,String content) {
        this.key = key;
        this.content = content;
    }

//    methods
    public void print() {
        if (content == null) throw new NoSuchElementException("Tree is empty");
        System.out.print("\033[0;31m" + "key= " + "\033[0m");
        System.out.print("\033[0;33m" + this.key + "\033[0m");
        System.out.print("\033[0;35m" + " content= " + "\033[0m");
        System.out.println("\033[0;36m" + content.toString() + "\033[0m");
    }
}
