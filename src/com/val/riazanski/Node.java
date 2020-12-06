package com.val.riazanski;

public class Node {
    //    fields
    int key;
    Book content;
    Node leftRamus;
    Node rightRamus;
//    constructors
    public Node() {
    }
    public Node(int key,Book content) {
        this.key = key;
        this.content = content;
    }

//    methods
    public void print() {
        System.out.print("\033[0;31m" + "key= " + this.key + "\033[0m");
        System.out.print("\033[0;32m" + " content= " + "\033[0m");
        content.print();
    }
}
