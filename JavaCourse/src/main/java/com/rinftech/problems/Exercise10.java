package com.rinftech.problems;

import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat", "listen", "silent", "enlist", "hello", "world", "dlrow"};
        Map<Integer, List<String>> result = groupAnagrams(input);

        for (Map.Entry<Integer, List<String>> entry : result.entrySet()) {
            System.out.println("Group nr.: " + entry.getKey() + ", Elements: " + entry.getValue());
        }
    }

    public static Map<Integer, List<String>> groupAnagrams(String[] input) {
        Map<Integer, List<String>> anagramMap = new HashMap<>();
        anagramMap.put(0, new ArrayList<>(Collections.singletonList(input[0])));

        for (int i = 1; i < input.length; i++) {
            String currentElement = input[i];
            boolean alreadyAdded = false;

            for (Map.Entry<Integer, List<String>> entry : anagramMap.entrySet()) {
                List<String> groupList = entry.getValue();
                if (!groupList.isEmpty()) {
                    String groupMember = groupList.get(0);
                    if (currentElement.length() == groupMember.length()) {
                        char[] firstWord = currentElement.toCharArray();
                        char[] secondWord = groupMember.toCharArray();
                        Arrays.sort(firstWord);
                        Arrays.sort(secondWord);

                        if (Arrays.equals(firstWord, secondWord)) {
                            groupList.add(currentElement);
                            alreadyAdded = true;
                            break;
                        }
                    }
                }
            }
            if (!alreadyAdded) {
                anagramMap.put(anagramMap.size(), new ArrayList<>(Collections.singletonList(currentElement)));
            }
        }
        return anagramMap;
    }
}
