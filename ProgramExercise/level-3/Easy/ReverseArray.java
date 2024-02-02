//11. Write a Java program to reverse an array of integer values
import java.util.Scanner;
public class ReverseArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int s=sc.nextInt();
		int a[]=new int[s];
		System.out.println("Enter the element");
		for(int i=0;i<s;i++)
		{
		       a[i]=sc.nextInt();
		}
                System.out.println("reversed array");
                for(int i=s-1;i>=0;i--)
		{
                    System.out.println(a[i]+" ");
		}
	}
}

