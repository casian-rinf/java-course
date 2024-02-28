package com.rinftech.practice.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String [] firstArray = { "Python", "Java", "GoLang", "Lisp" };
        String [] secondArray = { "Java", "C++", "Apples", "Hamburger", "Lisp" };

        String [] resultArray = findCommonElements(firstArray, secondArray);
        System.out.println("Common elements:");
        for (String element : resultArray)
            System.out.println(element);

    }

    public static String[] findCommonElements(String[] firstArray, String[] secondArray) {
        List<String> auxList = new ArrayList<>();
        for (String s : firstArray)
            if (Arrays.asList(secondArray).contains(s))
                auxList.add(s);
        return auxList.toArray(new String[0]);
    }
}
