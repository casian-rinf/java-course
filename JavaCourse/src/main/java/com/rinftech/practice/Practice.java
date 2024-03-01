package com.rinftech.practice;

import java.util.*;

public class Practice {

    //1
    public int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    //2
    public void countLettersSpacesNumbers(String input) {
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        for (Character ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
    }

    //5
    public static String[] findCommonElements(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(array1));
        Set<String> set2 = new HashSet<>(Arrays.asList(array2));

        set1.retainAll(set2);

        String[] commonElements = new String[set1.size()];
        set1.toArray(commonElements);

        return commonElements;
    }

    //8
    public void swapElements(ArrayList<String> list, int index1, int index2) {
        if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
            System.out.println("Invalid indices.");
            return;
        }

        String aux = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, aux);
    }

    //9
    public void findOccurrences(List<String> list, String element) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }

        if (firstOccurrence != -1) {
            System.out.println("First occurrence for " + element + " is position " + firstOccurrence + " and last is position " + lastOccurrence);
        } else {
            System.out.println("Element " + element + " not found in the list.");
        }
    }

    //10
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        Practice practice = new Practice();

        System.out.println(practice.sumOfDigits(8733));
        System.out.println();

        practice.countLettersSpacesNumbers("The quick brown fox jumps over 42 lazy dogs");
        System.out.println();

        String[] array1 = {"Python", "Java", "GoLang", "Lisp"};
        String[] array2 = {"Java", "C++", "Apples", "Hamburger", "Lisp"};
        System.out.println(Arrays.toString(findCommonElements(array1, array2)));
        System.out.println();

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink", "Black"));
        practice.swapElements(list, 1, 4);
        System.out.println();

        practice.findOccurrences(list, "Black");
        System.out.println();

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat", "listen", "silent", "enlist", "hello", "world", "dlrow"};
        System.out.println(practice.groupAnagrams(strs));
        System.out.println();
    }
}
