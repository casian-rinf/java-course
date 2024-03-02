package com.rinftech.problems;

public class Exercise2 {
    public static void main(String[] args) {
        countCharacters("The quick brown fox jumps over 42 lazy dogs");
    }
    private static void countCharacters(String input) {
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        for (char c : input.toCharArray()) {
            if ((c >= 65 && c <= 90 ) || (c >= 97 && c <= 122)) {
                letterCount++;
            } else if (c == 32) {
                spaceCount++;
            } else if (c >= 48 && c <= 57){
                numberCount++;
            }
        }
        System.out.println("Letters: " + letterCount + " Spaces: " + spaceCount + " Numbers: " + numberCount);
    }
}
