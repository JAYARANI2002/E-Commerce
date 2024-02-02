//Implement a program that determines whether a given string is a palindrome (i.e., it reads the same forwards and backwards).

import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		String rev="";
		int i;
		char ch[]=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			rev=ch[i]+rev;
	        }
		if(rev.equals(str))
		{
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The string is not a palindrome");
		}
	}
}
