//Write a program to find the Fibonacci sequence up to a given limit using looping.
import java.util.Scanner;
public class FibonacciSequence
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the limit of the sequence");
		int first=0,second=1,i,next;
		int n=sc.nextInt();
		System.out.println(first+"\n"+second);
		for(i=2;i<n;i++)
		{
			next=first+second;
			first=second;
			second=next;
		        System.out.println(next);
		}
	}
}


