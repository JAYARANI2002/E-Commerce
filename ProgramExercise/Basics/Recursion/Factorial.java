//Write a program to calculate the factorial of a given number using recursion.
import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int fact=1;
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
	static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
}


