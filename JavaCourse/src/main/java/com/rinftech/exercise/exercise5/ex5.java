package com.rinftech.exercise.exercise5;

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        // with String arrays
        String[] newArray1 = {"Python", "Java", "GoLang", "Lisp"};
        String[] newArray2 = {"Java", "C++", "Apples", "Hamburger", "Lisp"};
        String[] ans = commonElements1(newArray1, newArray2);
        System.out.println(Arrays.toString(ans));

        // with ArrayLists
        ArrayList<String> firstArray = new ArrayList<>(Arrays.asList("Python", "Java", "GoLang", "Lisp"));
        ArrayList<String> secondArray = new ArrayList<>(Arrays.asList("Java", "C++", "Apples", "Hamburger", "Lisp"));
        System.out.println(commonElements2(firstArray, secondArray));
    }

    public static String[] commonElements1(String[] firstArray, String[] secondArray){
        String[] ans = new String[firstArray.length];
        int nr = 0;
        for (String s : firstArray) {
            boolean ok = true;
            for (int j = 0; j < secondArray.length && ok; j++) {
                if(Objects.equals(s, secondArray[j])) {
                    ok = false;
                }
            }

            if (!ok) {
                ans[nr++] = s;
            }
        }

        return ans;
    }

    public static ArrayList<String> commonElements2(ArrayList<String> firstArray, ArrayList<String> secondArray){
        Set<String> set1 = new HashSet<>(firstArray);
        Set<String> set2 = new HashSet<>(secondArray);
        set1.retainAll(set2);

        return new ArrayList<>(set1);
    }
}
