package com.rinftech.Exercices;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex5
{
    public static void main(String[] args)
    {
        String[] firstArray = { "Python", "Java", "GoLang", "Lisp" };
        String[] secondArray = { "Java", "C++", "Apples", "Hamburger", "Lisp"};

        Set<String> firstSet = new HashSet<>();
        Set<String> secondSet = new HashSet<>();

        for(String str:firstArray)
        {
            firstSet.add(str);
        }

        for (String str:secondArray)
        {
            secondSet.add(str);
        }

        firstSet.retainAll(secondSet);

        System.out.println("Common elements between the arrays: " + firstSet);

    }
}
