//48. Write a Java program to arrange the elements of an given array of integerswhere all negative integers appear before all the positive integers. 
import java.util.Scanner;
public class ArrangeArray 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<n;i++)
		{
		        if(a[i]<0 && i!=j)
		        {
				   int t=a[i];
				   a[i]=a[j];
			           a[j]=t;
			       
			        j++;
			        }
		}
		for(int t:a)
			System.out.println(t);
	}
}
