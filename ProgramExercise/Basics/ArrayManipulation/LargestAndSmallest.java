//Write a program to find the smallest and largest elements in an array of integers
import java.util.Scanner;
public class LargestAndSmallest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int s=sc.nextInt();
		int a[]=new int[s];
		int max=0,min;
		System.out.println("Enter the element");
		for(int i=0;i<s;i++)
		{       
			a[i]=sc.nextInt();
		}
		System.out.println("Find min and max");
		min=a[0];
		for(int i=0;i<s;i++)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Smallest="+min+" Largest="+max);
	}
}

