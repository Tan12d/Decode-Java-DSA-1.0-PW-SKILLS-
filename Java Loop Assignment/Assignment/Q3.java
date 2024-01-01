package Loops_Assignment_Questions;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a=sc.nextInt();

        System.out.print("Enter the second number: ");
        int b=sc.nextInt();

        if(a!=0 && b!=0)
        {
            if(a<0)
            {
                a=-a;
            }

            if(b<0)
            {
                b=-b;
            }

            int gcd=0;

            if(a>=b)
            {
                for(int i=1;i<=b;i++)
                {
                    if(a%i==0 && b%i==0)
                    {
                        gcd=i;
                    }
                }
            }

            else
            {
                for(int i=1;i<=a;i++)
                {
                    if(a%i==0 && b%i==0)
                    {
                        gcd=i;
                    }
                }
            }

            System.out.println("GCD = "+gcd);
        }

        else
        {
            System.out.println("Numbers can't be zero");
        }

    }
}
