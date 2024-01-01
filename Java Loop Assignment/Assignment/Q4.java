package Loops_Assignment_Questions;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str= sc.next();

        int flag=1;

        for(int i=0,j=str.length()-1;i<str.length() && j>=0;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                flag=0;
                break;
            }
        }

        if(flag==1)
        {
            System.out.println(str+" is a Palindrome");
        }

        else
        {
            System.out.println(str+" is not a Palindrome");
        }
    }
}
