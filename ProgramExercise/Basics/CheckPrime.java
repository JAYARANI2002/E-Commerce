//Write a program to check if a given number is a prime number using recursion.
import java.util.Scanner;
public class CheckPrime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPrime(n,2));
	}
	static boolean isPrime(int n,int i)
	{
		if(n<=2)
			return false;
		if(n==2)
			return true;
		if(i*i>n)
			return true;
		isPrime(n,i+1);

	}
}

