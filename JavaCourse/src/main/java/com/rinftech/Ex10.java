package com.rinftech;

import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat", "listen", "silent", "enlist", "hello", "world", "dlrow"};
        Map<String, List<String>> anagrams = groupAnagrams(input);

        for(List<String> anagram:anagrams.values())
        {
            System.out.println(anagram);
        }
    }

    public static Map<String, List<String>> groupAnagrams(String[] input) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : input) {
            char[] arrChar = str.toCharArray();
            Arrays.sort(arrChar);
            String sortedLettersWord = new String(arrChar);

            if (!anagrams.containsKey(sortedLettersWord)) {
                anagrams.put(sortedLettersWord, new ArrayList<>());
            }
            anagrams.get(sortedLettersWord).add(str);
        }

        return anagrams;
    }
}