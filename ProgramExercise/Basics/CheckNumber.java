//Write a program that asks the user to enter a number and then prints out whether the number is positive, negative, or zero.

import java.util.Scanner;
public class CheckNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num==0)
		{
			System.out.println("The number is zero");
		}
		else
		{
			System.out.println(num>0?"The number is positive":"The number is negative");
		}
	}
}
