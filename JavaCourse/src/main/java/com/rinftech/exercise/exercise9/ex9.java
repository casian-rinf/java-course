package com.rinftech.exercise.exercise9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink", "Green", "Green", "Black", "Yellow", "White"));
        int[] ans = finder(words);
        if(ans[0] != -1) {
            System.out.println(ans[0] + " " + ans[1]);
        }
        else{
            System.out.println("The word isn't in the array!");
        }
    }

    public static int[] finder(ArrayList<String> words){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String findWord = scanner.nextLine();

        int[] ans = new int[2];
        ans[0] = -1;
        int i, j;
        for(i = 0; i < words.size(); i++){
            if(Objects.equals(words.get(i), findWord)){
                ans[0] = i;
                break;
            }
        }

        for(j = words.size() - 1; j >= i; j--){
            if(Objects.equals(words.get(j), findWord)){
                ans[1] = j;
                break;
            }
        }

        return ans;
    }
}
