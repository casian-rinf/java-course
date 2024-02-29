package com.rinftech.ExercitiiMariaTodirel.ex1and2;


public class Main {
    public static int sum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static String count(String input) {
        int[] counter = new int[3];
        for(int i : counter){
            i=0;
        }
        for (char letter : input.toCharArray()) {
            if (('a' <= letter && 'z' >= letter) || ('A' <= letter && 'Z' >= letter)) {
                counter[0]++;
            } else if ('0' <= letter && '9' >= letter) {
                counter[1]++;
            } else if (letter == ' ') {
                counter[2]++;
            }
        }
        StringBuilder output = new StringBuilder();
        output.append("Letters: ").append(counter[0]).append(", ");
        output.append("Numbers: ").append(counter[1]).append(", ");
        output.append("Spaces: ").append(counter[2]);
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(sum(8733));
        System.out.println(count( "The quick brown fox jumps over 42 lazy dogs"));
    }
}