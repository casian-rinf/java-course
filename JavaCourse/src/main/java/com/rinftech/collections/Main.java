package com.rinftech.collections;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            input.add(random.nextInt(5));
        }
        System.out.println(input);
        System.out.println("Numar x apare de y ori");

        Map<Integer, Integer> result = new TreeMap<>();
        for (Integer element : input) {
            if (!result.containsKey(element)) {
                result.put(element, 1);
            } else {
                result.put(element, result.get(element) + 1);
            }
        }

        for (Integer entry : result.keySet()) {
            System.out.println("Numarul " + entry + " apare de " + result.get(entry) + " ori");
        }


//        String[] array = new String[100];
//        List<String> firstList = new ArrayList<>();
//        firstList.add("Primul");
//        firstList.add("Al doilea");
//        firstList.add("Al treilea");
//
//
//        List<String> linkedList = new LinkedList<>();
//        linkedList.add("Primul");
//        linkedList.add("Al doilea");
//        linkedList.add("Al treilea");
//        linkedList.add("Al treilea");
//        linkedList.add("Al treilea");
//
//        linkedList.remove(1);
//
//        System.out.println(linkedList.contains("Al doilea"));
//
//        for (int i = 0; i < firstList.size(); i++) {
//            System.out.println(firstList.get(i) + " ");
//
//        }
//        System.out.println();
//
//        for (String element : linkedList) {
//            System.out.println(element + " ");
//        }
//        System.out.println();
//
//        Set<String> setFromList = new HashSet<>();
//        setFromList.addAll(linkedList);
//        setFromList.add("Al patrulea");
//        setFromList.add("Al cincielea");
//        setFromList.add("Al 6");
//        setFromList.add("Al 7");
//        setFromList.add("Al 8");
//        setFromList.add("Al 9");
//        setFromList.add("Al 10");
//
//
//        System.out.println(setFromList);
//        System.out.println();
//
//        Set<String> linkedSet = new LinkedHashSet<>();
//        linkedSet.add("Primul");
//        linkedSet.add("Al doilea");
//        linkedSet.add("Al treilea");
//        linkedSet.add("Al patrulea");
//        linkedSet.add("Al cincielea");
//
//        System.out.println(linkedSet);

    }
}
