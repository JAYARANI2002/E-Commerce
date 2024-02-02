//Write a program to print the first 10 numbers of the Fibonacci sequence.
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int first=0,second=1,n,i,next;
		n=sc.nextInt();
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



