package com.val.riazanski;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] arrayKey = new int[10];
        Book[] arrayBook = new Book[10];
        for (int i = 0; i < 10; i++) {
            arrayKey[i] = (int) (Math.random() * 300);
            arrayBook[i] = new Book(1);
//            System.out.print(arrayKey[i]);
//            arrayBook[i].print();
            tree.append(arrayKey[i],arrayBook[i]);
        }
        for (int i = 9; i >= 0; i--) {
            tree.find(arrayKey[i]).print();
        }
        tree.traversal(tree.getRoot());
    }
}
