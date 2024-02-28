package com.rinftech.practice.two;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static final String LETTERS = "Letters";
    static final String NUMBERS = "Numbers";
    static final String SPACES = "Spaces";

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put(LETTERS, 0);
        map.put(SPACES, 0);
        map.put(NUMBERS, 0);
        String input = "The quick brown fox jumps over 42 lazy dogs";

        analyzeText(input, map);
        System.out.println("The text has: \n" + "Letters: " + map.get(LETTERS) + "\n" +
                "Numbers: " + map.get(NUMBERS) + "\n" + "Spaces: " + map.get(SPACES));
    }

    public static void analyzeText(String text, Map<String, Integer> map) {
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z' ||
                    text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')
                map.put(LETTERS, map.get(LETTERS) + 1);
            else if (text.charAt(i) >= '0' && text.charAt(i) <= '9')
                map.put(NUMBERS, map.get(NUMBERS) + 1);
            else map.put(SPACES, map.get(SPACES) + 1);
    }
}
