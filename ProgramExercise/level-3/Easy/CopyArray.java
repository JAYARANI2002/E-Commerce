//8. Write a Java program to copy an array by iterating the array.
import java.util.Scanner;
public class CopyArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size");
		int s=sc.nextInt();
		int a[]=new int[s];
		int b[]=new int[s];
		System.out.println("Enter the element");
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		for(int i:b)
		{
			System.out.println(i);
		}
	}
}
