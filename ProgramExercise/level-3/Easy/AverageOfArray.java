//4. Write a Java program to calculate the average value of array elements
import java.util.Scanner;
public class AverageOfArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int [n];
		int sum=0;
		System.out.println("Enter the element of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
                        sum+=a[i];
		}
		System.out.println("Average of the array :" +(int )sum/n);
	}
}

