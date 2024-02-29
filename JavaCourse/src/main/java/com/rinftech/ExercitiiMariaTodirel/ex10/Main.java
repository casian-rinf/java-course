package com.rinftech.ExercitiiMariaTodirel.ex10;

import java.util.*;

public class Main {
    public static  List<List<String>> grouping(String[] input){
      Map<String,List<String>> groups = new HashMap<>();
      for(String element: input){
          char[] chars = element.toCharArray();
          Arrays.sort(chars);
          String sortedElement = new String(chars);
          if(!groups.containsKey(sortedElement)){
              groups.put(sortedElement, new ArrayList<>());
          }
          groups.get(sortedElement).add(element);
      }

      return new ArrayList<>(groups.values());
    }
    public static void main(String[] args){
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat", "listen", "silent", "enlist", "hello", "world", "dlrow"};
        System.out.println(grouping(input));
    }
}
