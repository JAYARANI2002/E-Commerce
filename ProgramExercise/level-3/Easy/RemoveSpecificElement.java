//7. Write a Java program to remove a specific element from an array.
import java.util.Scanner;
public class RemoveSpecificElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the remove  element index");
		int s=sc.nextInt();//remove Element index
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=s;i<n-1;i++)
		{
		       a[i]=a[i+1];
		}
		System.out.println("after Remove element from the array"+"array length"+a.length);
		for(int t:a)
			System.out.println(t);

	}

}
