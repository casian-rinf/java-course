package com.rinftech.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Integer number = 8733;
        Integer answer1 = sumDigits(number);
        System.out.println(answer1);

//        String input = "The quick brown fox jumps over 42 lazy dogs";
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your input: ");

        String input = myObj.nextLine();
        Map<String, Integer> answer2 = countLetters(input);
        System.out.println(answer2);
    }

    public static Integer sumDigits(Integer number) {
        Integer sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static Map<String, Integer> countLetters(String input) {
        Map<String, Integer> result = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!result.containsKey("Letters")) {
                    result.put("Letters", 1);
                } else {
                    result.put("Letters", result.get("Letters") + 1);
                }
            } else if (Character.isWhitespace(c)) {
                if (!result.containsKey("Spaces")) {
                    result.put("Spaces", 1);
                } else {
                    result.put("Spaces", result.get("Spaces") + 1);
                }
            } else if (Character.isDigit(c)) {
                if (!result.containsKey("Numbers")) {
                    result.put("Numbers", 1);
                } else {
                    result.put("Numbers", result.get("Numbers") + 1);
                }
            }
        }
        return result;
    }
}
