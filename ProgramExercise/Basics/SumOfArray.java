//Write a program to find the sum of all the elements in an array of integers.
import java.util.Scanner;
public class SumOfArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int i,a[]=new int[n],sum=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum of the array"+sum);
	}
}

