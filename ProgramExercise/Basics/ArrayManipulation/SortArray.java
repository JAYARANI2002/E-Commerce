//Write a program to sort an array of integers in ascending and descending order.
import java.util.Scanner;
public class SortArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the element of the array");
		int a[]=new int[n];
                int i,temp,j;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
			        {
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				}
			}
		}
		System.out.println("Array in ascending order");
		for(int v:a)
			System.out.println(v);
		for(i=0;i<n;i++)
                {
                        for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
                                {
                                   temp=a[i];
                                   a[i]=a[j];
                                   a[j]=temp;
                                }
			}
                }
		System.out.println("Array in descending order");
		for(int k:a)
			System.out.println(k);
	}
}


