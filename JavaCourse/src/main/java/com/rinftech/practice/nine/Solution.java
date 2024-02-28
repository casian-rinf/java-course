package com.rinftech.practice.nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String word = "Green";
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Green");
        list.add("Green");
        list.add("Black");
        list.add("Yellow");
        list.add("White");

        int firstOccurrence = list.indexOf(word);
        Collections.reverse(list);
        int lastOccurrence = list.size() - list.indexOf(word) - 1;
        System.out.println("First occurrence for " + word + " is position " + firstOccurrence +
                " and last is position " + lastOccurrence);
    }
}
