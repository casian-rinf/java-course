package com.rinftech.ExercitiiMariaTodirel.ex8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<String>swap(List<String>input, int poz1, int poz2){
        Collections.swap(input, poz1, poz2);
        return input;
    }
    public static void main(String[] args){
       List<String>input = Arrays.asList("Red", "Green", "Black", "White", "Pink");
       System.out.println(swap(input, 1, 4));
    }
}
