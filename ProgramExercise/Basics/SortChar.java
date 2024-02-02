//Create a program that reads in a list of names from the user and then sorts them in alphabetical order.

import java.util.Scanner;
public class SortChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of String");
	        int n=sc.nextInt();
		System.out.println("Enter the string");
		String strings[]=new String[n];
		int i,j;
		String temp;
		for(i=0;i<n;i++)
		{
			strings[i]=sc.next();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<=n-1;j++)
		        {
			if(strings[i].compareTo(strings[j])>0)
			{
				temp=strings[i];
				strings[i]=strings[j];
				strings[j]=temp;
			}
			}
		
		}
		System.out.println("Strings in alphabetical order");
		for(String t:strings)
			System.out.println(t);
	}
}


