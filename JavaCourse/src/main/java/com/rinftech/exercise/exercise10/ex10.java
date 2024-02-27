package com.rinftech.exercise.exercise10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import static java.util.Arrays.sort;

public class ex10 {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat", "listen", "silent", "enlist", "hello", "world", "dlrow"};
        System.out.println(mapper(words));
    }

    public static HashMap<String, ArrayList<String> > mapper(String[] words){
        HashMap<String, ArrayList<String> > mapping = new HashMap<>();
        for (String word : words) {
            String[] letters = word.split("");
            sort(letters);
            String actual_key = "";
            for(String letter : letters){
                actual_key += letter;
            }

            if (mapping.get(actual_key) == null) {
                ArrayList<String> array = new ArrayList<>();
                array.add(word);
                mapping.put(actual_key, array);
            }
            else{
                mapping.get(actual_key).add(word);
            }
        }

        return mapping;
    }
}
