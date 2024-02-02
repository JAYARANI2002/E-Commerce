//Write a program to find the average of all the elements in an array of doubles.
import java.util.Scanner;
public class AverageOfArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int n=sc.nextInt();
		int i;
		System.out.println("Enter the element");
		double a[]=new double[n],sum=0,avg=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextDouble();
			sum+=a[i];
		}
		avg=sum/n;
		System.out.println(avg);
	}
}
