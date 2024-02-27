package com.rinftech.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Probl8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            List<String> array = readArray(scanner);
            Integer pos1 = scanner.nextInt();
            Integer pos2 = scanner.nextInt();

            String element1 = array.get(pos1);
            String element2 = array.get(pos2);

            array.set(pos1, element2);
            array.set(pos2, element1);

            System.out.println(array.toString());
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
}
