//Write a Java program to insert an element (specific position) into an array.
import java.util.Scanner;
public class InsertElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int s=sc.nextInt();
		System.out.println("The insert element");
		int n=sc.nextInt();
		System.out.println("Enter the position");
		int p=sc.nextInt();
		int a[]=new int[s];
		int b[]=new int[s+1];
		System.out.println("Enter the element of the array");
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Update");
		for(int i=0,j=0;j<(s+1);j++)
		{
			if(j==p)
			{
				b[j]=n;
			
			}
			else
			{
				b[j]=a[i];
				i++;
			}

		}
		b[p]=n;
		System.out.println("The original array");
		for(int j:b)
		{
			System.out.println(j);
		}
	}
}

