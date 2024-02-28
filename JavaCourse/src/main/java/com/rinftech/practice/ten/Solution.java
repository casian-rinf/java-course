package com.rinftech.practice.ten;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String [] array = {"eat", "tea", "tan", "ate", "nat", "bat", "listen",
                "silent", "enlist", "hello", "world", "dlrow"};
        Map<String, List<String>> map = new HashMap<>();

        for (String element : array) {
            char[] chars = element.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            List<String> anagrams;
            if (!map.containsKey(sorted))
                anagrams = new ArrayList<>();
            else anagrams = map.get(sorted);

            anagrams.add(element);
            map.put(sorted, anagrams);
        }

        System.out.println("Grouped anagrams:");
        for (String entry : map.keySet())
            System.out.println(map.get(entry));
    }
}
