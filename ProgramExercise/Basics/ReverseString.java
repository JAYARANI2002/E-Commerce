//Write a program that takes a string as input and reverses the order of the characters in the string.


import java.util.Scanner;
public class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String reverse="";
		char ch[]=s.toCharArray();
		int c;
		for(c=0;c<s.length();c++)
		{

			reverse=ch[c]+reverse;
		}
		System.out.println("Reverse string\n"+reverse);
	}
}

