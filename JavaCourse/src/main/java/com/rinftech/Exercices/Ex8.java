package com.rinftech.Exercices;

public class Ex8
{
    public static void main(String[] args)
    {
        String[] input = {"Red", "Green", "Black", "White", "Pink"};
        int index1 = 1;
        int index2 = 4;

        String[] output = swapStrings(input, index1, index2);
        
        for (int i = 0;i<output.length;i++)
        {
            System.out.println(output[i]);
        }
    }

    public static String[] swapStrings(String[] input, int index1, int index2)
    {
        String aux = input[index1];
        input[index1] = input[index2];
        input[index2] = aux;

        return input;
    }
}
