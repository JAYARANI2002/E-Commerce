//Write a program that asks the user to enter a number between 1 and 100. If the number is between 1 and 50, print out "The number is in the lower half." If the number is between 51 and 100, print out "The number is in the upper half." If the number is outside the range of 1 to 100, print out "Invalid number."

import java.util.Scanner;
public class NumberRange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number between 1 to 100");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("The given number is zero");
		}
		else if(n>50 && n<=100)
		{
			System.out.println("The given number is in the upper half");
		}
		else if(n>0 && n<=50)
		{
			System.out.println("The number is in the lower range");
		}
		else
		{
			System.out.println("Invalid number");
		}
	}
}

