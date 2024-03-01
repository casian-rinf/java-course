package com.rinftech.exercise.exercise2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:");
        String text = scanner.nextLine();

        int[] values = counter(text);
        System.out.println("Letter: " + values[0] + ", Spaces: " + values[1] + ", Numbers: " + values[2]);
    }

    public static int[] counter(String text){
        String text_aux = text.toLowerCase();
        int[] values = new int[3];
        for(int i = 0; i < text_aux.length(); i++){
            if(text_aux.charAt(i) == ' '){
                values[1]++;
            }
            else if(text_aux.charAt(i) >= '0' && text_aux.charAt(i) <= '9'){
                values[2]++;
            }
            else if(text_aux.charAt(i) >= 'a' && text_aux.charAt(i) <= 'z'){
                values[0]++;
            }
        }

        return values;
    }
}
