package com.val.riazanski;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] arrayKey = new int[10];
        int[] prime = {619, 647, 691, 719, 727, 739, 757, 769, 797,811};
        Book[] arrayBook = new Book[10];
        for (int i = 0; i < 10; i++) {
            arrayKey[i] = (int) (Math.random() * prime[i] * 0.3);
            arrayBook[i] = new Book(1);
            System.out.print("key= " + arrayKey[i] + " content= ");
            arrayBook[i].print();
            tree.append(arrayKey[i],arrayBook[i]);
        }
        for (int i = 0; i < 10; i++) {
            tree.find(arrayKey[i]).print();
        }
        tree.traversal(tree.getRoot());
        tree.traversalDecrease(tree.getRoot());
    }
}
