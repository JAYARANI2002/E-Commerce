//Write a program that generates a multiplication table for a given number.
import java.util.Scanner;
public class MultiplicationTable
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the multiplication table");
		int n=sc.nextInt();
	        int i;
		for(i=0;i<=12;i++)
		{
		  System.out.println(n+"X"+i+"="+n*i);
		}
	}
}	
