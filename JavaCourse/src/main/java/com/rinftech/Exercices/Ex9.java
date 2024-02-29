package com.rinftech.Exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex9
{
    public static void main(String[] args)
    {
        List<String> input = new ArrayList<>();
        input = Arrays.asList("Red", "Green", "Black", "White", "Pink", "Green", "Green", "Black", "Yellow", "White");
        String element = "Green";

        getFirstAndLastOccurences(input, element);
    }

    private static void getFirstAndLastOccurences(List<String> input, String element)
    {
        int firstOccurence = input.indexOf(element);
        int lastOccurence =  input.lastIndexOf(element);
        System.out.println("First occurence = " + firstOccurence + " and last occurence = " + lastOccurence);
    }
}
