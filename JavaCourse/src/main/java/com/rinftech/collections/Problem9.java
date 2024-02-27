package com.rinftech.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
//            List<String> array = readArray(scanner);
//            String color = scanner.nextLine();
            List<String> array = new ArrayList<>(Arrays.asList(
                    "Red", "Green", "Black", "White", "Pink",
                    "Green", "Green", "Black", "Yellow", "White"
            ));
            String color = "Green";
            System.out.println("First position is " + array.indexOf(color));
            System.out.println("Last position is " + array.lastIndexOf(color));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }

    public static List<String> readArray(Scanner scanner) {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        List<String> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array.add(scanner.nextLine());
        }
        return array;
    }

}
