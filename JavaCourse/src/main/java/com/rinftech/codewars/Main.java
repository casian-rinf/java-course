package com.rinftech.codewars;

import java.util.Locale;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String a = "abcd";
        System.out.println(solution("a"));
        System.out.println();

        int n = 1234;
        System.out.println(countBits(n));
        System.out.println();

        System.out.println(fisrtNonRepeatingLetter("hello word,c?"));
        System.out.println();

        int[] input = new int[]{-10,-9,-8,-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20};
        System.out.println(rangeExtraction(input));


    }

    //'abc'=> ["ab","c_"] ; "abcd" => ["ab","cd"]
    public static String[] solution(String s) {

        boolean isOdd = s.length() % 2 == 1;
        if (isOdd) {
            s = s + "_";

        }
        String[] result = new String[s.length() / 2];

        for (int i = 0; i < s.length() - 1; i += 2) {
            result[i / 2] = s.substring(i, i + 2);

        }
        return result;
    }

    //1234 => 100111010010 transformare in baza doi si sa se calculeze cati de 1 sunt =5
    public static int countBits(int n) {
        String binaryForm = Integer.toBinaryString(n);

        return (int) Stream.of(binaryForm.split(""))
                .filter(digit -> Integer.parseInt(digit) == 1)
                .count();
    }

    //first_non_repeating_letter "stress"=> t prima litera care nu se repeta
    public static String fisrtNonRepeatingLetter(String s) {

        if (s.isEmpty()) {
            return "";
        }

        String lowerS = s.toLowerCase();
        char[] chars = lowerS.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            int firstIndex = s.indexOf(chars[i]);
            int lastIndex = s.lastIndexOf(chars[i]);

            if (firstIndex == lastIndex) {
                return s.substring(i, i + 1);

            }

        }
        String lastChar = s.substring(s.length() - 1);
        if (lowerS.indexOf(lastChar) == lowerS.length() - 1) {
            return s.substring(s.length() - 1);
        }
        return "";

    }

    //int=-10,-9,-8,-6,-1,0,1,2,4 => -10--8,-6,-1-2,4
    public static String rangeExtraction(int[] arr) {
        StringBuilder result = new StringBuilder();
        int left = 0;
        for (int right = 1; right < arr.length; right++) {
            if (arr[right - 1] - arr[right] != -1) {
                if (left == right - 1) {
                    //result += arr[left];
                    result.append(arr[left])
                            .append(",");
                } else {
                    //result += arr[left]+"-"+arr[right-1];
                    result.append(arr[left])
                            .append("-")
                            .append(arr[right - 1])
                            .append(",");
                }
                left = right;

            }

        }
        if ( left == arr.length - 1) {
            result.append(arr[left]);
        }else{
            result.append(arr[left])
                    .append("-")
                    .append(arr[arr.length-1]);
        }
        return result.toString();
    }

    //aceasi prob dar afiseaza doar intervale care sunt minim 3 altfel nr sunt puse singure
}
