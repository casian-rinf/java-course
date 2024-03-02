package com.rinftech.problems;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("Result: " + computeDigitsSum(8733));
    }
    private static int computeDigitsSum(int input) {
        int result = 0;
        while (input != 0) {
            result += input % 10;
            input /= 10;
        }
        return result;
    }
}
