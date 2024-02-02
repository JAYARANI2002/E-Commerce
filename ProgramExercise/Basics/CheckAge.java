//Create a program that asks the user to enter their age. If the user is 18 or older, print out "You are an adult." Otherwise, print out "You are not yet an adult."

import java.util.Scanner;
public class CheckAge
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
	        System.out.println(age>=18?"You are an adult":"You are not yet adult");
	}
}

