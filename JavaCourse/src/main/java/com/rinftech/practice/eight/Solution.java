package com.rinftech.practice.eight;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        int firstIndex = 1;
        int secondIndex = 4;

        String aux = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, aux);

        System.out.println("The modified list: " + list);
    }
}
