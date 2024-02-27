package com.rinftech.collections;

import java.util.*;

public class Probl10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
//            List<String> array = readArray(scanner);
//            String color = scanner.nextLine();
            List<String> array = new ArrayList<>(Arrays.asList(
                    "eat", "tea", "tan", "ate", "nat", "bat", "listen", "silent", "enlist", "hello", "world", "dlrow"
            ));
            Map<String, List<String>> result = groupAnagrams(array);
            System.out.println(result.toString());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }

    public static Map<String, List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!anagramsMap.containsKey(sortedWord)) {
                anagramsMap.put(sortedWord, new ArrayList<>());
            }
            anagramsMap.get(sortedWord).add(word);
        }

        return anagramsMap;
    }
}
