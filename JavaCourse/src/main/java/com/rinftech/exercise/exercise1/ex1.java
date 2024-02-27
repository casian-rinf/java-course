package com.rinftech.exercise.exercise1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();

        System.out.println("Your number is: " + number);
        System.out.println("The sum of its digits is: " + sumDigits(number));
    }

    public static int sumDigits(int x){
        int sum = 0;
        while(x != 0){
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
