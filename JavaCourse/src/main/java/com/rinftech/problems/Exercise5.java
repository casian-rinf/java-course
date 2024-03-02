package com.rinftech.problems;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise5 {
    public static void main(String[] args) {
        String[] firstArray = {"Python", "Java", "GoLang", "Lisp"};
        String[] secondArray = {"Java", "C++", "Apples", "Hamburger", "Lisp"};
        System.out.println(findCommonElements(firstArray, secondArray));

    }

    public static StringBuilder findCommonElements(String[] firstArray, String[] secondArray) {
        HashSet<String> firstSet = new HashSet<>(Arrays.asList(firstArray));
        StringBuilder commonElements = new StringBuilder();

        for (String element : secondArray) {
            if (firstSet.contains(element)) {
                if (commonElements.length() == 0) {
                    commonElements.append(element);
                } else {
                    commonElements.append(", ");
                    commonElements.append(element);
                }
            }
        }
        return commonElements;
    }
}
