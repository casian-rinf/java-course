package com.rinftech.ExercitiiMariaTodirel.ex9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static int[] firstAndLastIndexOf(List<String>input, String element){
        int[] firstAndLast = new int[2];
        firstAndLast[0]=input.indexOf(element);
        firstAndLast[1]=input.lastIndexOf(element);
        return firstAndLast;
    }

    public static void main(String[] args){
        List<String>input= Arrays.asList( "Red", "Green", "Black", "White", "Pink", "Green", "Green", "Black", "Yellow", "White");
        System.out.println("First occurence for Green is "+firstAndLastIndexOf(input,"Green")[0]+" and last is  "+firstAndLastIndexOf(input,"Green")[1]);
    }
}
