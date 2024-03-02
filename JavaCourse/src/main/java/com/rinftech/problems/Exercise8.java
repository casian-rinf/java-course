package com.rinftech.problems;

import java.util.ArrayList;

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<String>();
        input.add("Red");
        input.add("Green");
        input.add("Black");
        input.add("White");
        input.add("Pink");
        System.out.println("Output: " + swapTwoElements(input, 1, 4));
    }

    public static ArrayList<String> swapTwoElements (ArrayList<String> input, int firstIndex, int secondIndex) {
        String elementCopy;
        elementCopy = input.get(firstIndex);
        input.set(firstIndex, input.get(secondIndex));
        input.set(secondIndex, elementCopy);
        return input;
    }
}
