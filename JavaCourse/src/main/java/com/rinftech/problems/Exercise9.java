package com.rinftech.problems;

import java.util.Arrays;
import java.util.List;

public class Exercise9 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Red", "Green", "Black", "White", "Pink", "Green", "Green", "Black", "Yellow"
                , "White");
        findFirstAndLastOccurrence(input, "Green");
    }
    public static void findFirstAndLastOccurrence(List<String> input, String elementToFind) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int j = input.size() - 1;
        for (int i = 0; i < input.size() && (firstOccurrence == -1 || lastOccurrence == -1); i++) {
            if (input.get(i).equals(elementToFind) && (firstOccurrence < 0)) {
                firstOccurrence = i;
            }
            if (input.get(j).equals(elementToFind) && (lastOccurrence < 0)) {
                lastOccurrence = j;
            }
            j--;
        }
        System.out.println("First occurrence for " + elementToFind + " is position " + firstOccurrence +
                " and last position is " + lastOccurrence);
    }
}
