package Loops_Assignment_Questions;

import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the no. of terms: ");
        int n=sc.nextInt();

        int j=0;
        int k=1;

        System.out.println(j);
        System.out.println(k);

        for(int i=3;i<=n;i++)
        {
            int n1=j;
            int n2=k;

            int n3= n1+n2;

            System.out.println(n3);

            j=k;
            k=n3;
        }

    }
}
