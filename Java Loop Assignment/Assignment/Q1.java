package Loops_Assignment_Questions;

import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();

        int sum = 0;

        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }

        System.out.println("Sum of first "+n+" natural numbers is "+sum);
    }
}
