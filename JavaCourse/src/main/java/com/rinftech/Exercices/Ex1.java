package com.rinftech.Exercices;

public class Ex1
{
    private static int sumOfDigits(int n)
    {
        int sum = 0;

        while(n != 0)
        {
            sum += n%10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int n, sum;

        n = 8733;
        sum = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " = " + sum);

        n = 123456789;
        sum = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " = " + sum);

        n = 29293129;
        sum = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " = " + sum);
    }
}
