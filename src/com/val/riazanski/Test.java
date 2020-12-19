package com.val.riazanski;

public class Test {
    public static void main(String[] args) {
//    static factory method
        Tree tree = Tree.newEmptyTree();
        int[] arrayKey = new int[10];
        int[] prime = {619, 647, 691, 719, 727, 739, 757, 769, 797,811};
        String[] arrayWord = new String[10];
        for (int i = 0; i < 10; i++) {
            arrayKey[i] = (int) (Math.random() * prime[i] * 0.3);
            arrayWord[i] = Book.makeWord(3);
//            System.out.println("key= " + arrayKey[i] + " content= " + arrayWord[i].toString());
            tree.append(arrayKey[i],arrayWord[i]);
        }
        for (int i = 0; i < 10; i++) {
            tree.find(arrayKey[i]).print();
        }
        tree.traversal(tree.getRoot());
        tree.traversalDecrease(tree.getRoot());
    }
}
