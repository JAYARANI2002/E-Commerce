//Write a program that calculates the sum of two numbers and prints the result.

import java.util.Scanner;
final class Sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		System.out.println("Sum of the "+num1+" and "+num2+"="+(num1+num2));
	}
}

