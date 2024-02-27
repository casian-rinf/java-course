package com.rinftech.Exercices;

import java.util.HashMap;
import java.util.Map;

public class Ex2
{
    private static Map<String,Integer> countCharacters(String s)
    {
        Map<String,Integer> counterMap = new HashMap<>();
        counterMap.put("Letters", 0);
        counterMap.put("Spaces", 0);
        counterMap.put("Numbers", 0);

        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == ' ')
            {
                counterMap.put("Spaces", counterMap.get("Spaces") + 1);
            }
            else if ((c>='a' && c<='z') || (c>='A' && c<='Z'))
            {
                counterMap.put("Letters",counterMap.get("Letters") + 1);
            }
            else if(c>='0' && c<='9')
            {
                counterMap.put("Numbers",counterMap.get("Numbers") +1);
            }
        }
        return counterMap;
    }

    public static void main(String[] args)
    {
        String input = "The quick brown fox jumps over 42 lazy dogs";
        System.out.println("String statistics: " + countCharacters(input));
    }
}
