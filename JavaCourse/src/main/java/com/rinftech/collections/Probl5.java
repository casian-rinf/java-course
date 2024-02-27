package com.rinftech.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Probl5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            List<String> firstArray = readArray(scanner);
            List<String> secondArray = readArray(scanner);
            List<String> result = findCommonElements(firstArray, secondArray);
            System.out.println(result.toString());
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
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

    public static List<String> findCommonElements(List<String> array1, List<String> array2) {
        List<String> result = new ArrayList<>();
        for (String element : array1) {
            for (String element1 : array2) {
                if (element.equals(element1)) {
                    result.add(element);
                }
            }
        }
        return result;
    }
}
