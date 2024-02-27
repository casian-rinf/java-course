package com.rinftech.exercise.exercise8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink"));
        reorder(words);
        System.out.println(words);
    }

    public static void reorder(ArrayList<String> words){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        if(number1 < words.size() && number2 < words.size()) {
            String aux = words.get(number1);
            words.set(number1, words.get(number2));
            words.set(number2, aux);
        }
        else{
            System.out.println("Your input is incorrect! The list will stay the same.");
        }
    }
}
