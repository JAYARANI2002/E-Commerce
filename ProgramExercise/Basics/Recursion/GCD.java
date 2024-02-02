//Write a program to find the greatest common divisor (GCD) of two numbers using recursion.

import java.util.Scanner;
public class GCD
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find GCD");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("GCD of two number is" +gcd(n1,n2));
	}
	static int gcd(int n1,int n2)
	{
		if(n2==0)
			return n1;
		return gcd(n2,n1%n2);
	}
}

