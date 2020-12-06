package com.val.riazanski;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.random;

public class Book {
    //fields
    private List<String> list = new ArrayList<String>();
    private int listCounter;
    private boolean flag = false;
    //constructors
    public Book(int listCounter) {
        this.init(listCounter);
    }
    //methods
    private void init(int listCounter) {
        final int n = listCounter;
        for (int i = 0; i < n; i++) {
            list.add(createWord(3));
        }
    }
    public void print() {
        System.out.println("\033[0;32m" + list.toString() + "\033[0m");
    }

    public String createWord(int n) {
        final int valueAlphabet = 26;
        final int shift = 97;
        String str = "";
        for (int k = 0; k < n; k++) {
            str = str + (char) ((int) (shift + valueAlphabet * random()));
        }
        return str;
    }
    public String createUpperWord(int n) {
        final int valueAlphabet = 26;
        final int shift = 65;
        String str = "";
        for (int k = 0; k < n; k++) {
            str = str + (char) ((int) (shift + valueAlphabet * random()));
        }
        return str;
    }
    public String createMetaWord(int n) {
        final int valueAlphabet = 20;
        final int shift = 280;
        String str = "";
        for (int k = 0; k < n; k++) {
            str = str + (char) ((int) (shift + valueAlphabet * random()));
        }
        return str;
    }

    public void metaChange(int fromString, String rePlace) {
        list.set(fromString, rePlace);
    }
    public List<String> getList() {
        return this.list;
    }

    public List<String> subBook(int start, int end, int wordValue) {
        List<String> tom = new ArrayList<>();
        for (int i = 0; i < wordValue; i++) {
            if ((start <= i) && (i < end)) {
                tom.add(list.get(i));
            }
        }
        System.out.println(tom.toString());
        return tom;
    }


}
