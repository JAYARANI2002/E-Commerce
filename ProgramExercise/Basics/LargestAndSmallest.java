//Write a program that finds the largest and smallest numbers in an array of integers.
import java.util.Scanner;
public class LargestAndSmallest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n=sc.nextInt();
		System.out.println("Enter the element");
		int number[]=new int[n];
		int i;
		for(i=0;i<=n-1;i++)
		{
			number[i]=sc.nextInt();
		}
		int smallest=number[0], largest=number[0],j;
		for(j=0;j<n;j++)
		{
			if(number[j]<smallest)
			{
				smallest=number[j];
			}
			if(number[j]>largest)
			{
				largest=number[j];

			}
		}
		System.out.println("Largest number is ="+largest+"\n"+"smallest number is ="+smallest);
	}
}


