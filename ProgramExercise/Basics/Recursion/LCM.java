//Write a program to find the least common multiple (LCM) of two numbers using looping.

import java.util.Scanner;
public class LCM
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find LCM");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int i,n;
		n=n1>n2?n1:n2;
		while(true)
		{
			if(n%n1==0 && n%n2==0)
		        {
				System.out.println("LCM "+n);
				break;
			}
			n++;
		}
	}
}
