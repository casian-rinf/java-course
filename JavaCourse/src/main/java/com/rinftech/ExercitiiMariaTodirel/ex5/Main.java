package com.rinftech.ExercitiiMariaTodirel.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<String>findCommonElements(String[]array1, String[]array2){
        List<String>commonElements = new ArrayList<>();
        ArrayList<String>array2List = new ArrayList<>(Arrays.asList(array2));
        for(String element: array1){
            if(array2List.contains(element)){
                commonElements.add(element);
            }
        }
        return commonElements;
    }
    public static void main(String[] args) {
        String[] s1={ "Python", "Java", "GoLang", "Lisp"};
        String[] s2={"Java", "C++", "Apples", "Hamburger", "Lisp"};
        System.out.println(findCommonElements(s1, s2));
    }
}
