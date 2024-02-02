//10. Write a Java program to find the maximum and minimum value of an array.
import java.util.Scanner;
public class MinAndMax
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
		System.out.println("minimum="+min+" Maximum="+max);
	}
}

