package com.rinftech.practice.one;

public class Solution {
    public static void main(String[] args) {
        long input = 8733;
        int result = computeSumOfDigits(input);
        System.out.println("The sum of an integer's digits = " + result);
    }

    public static int computeSumOfDigits(long number) {
        int result = 0;
        while (number != 0) {
            result += (int) (number % 10);
            number /= 10;
        }
        return result;
    }
}
