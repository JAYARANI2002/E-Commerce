import java.util.Scanner;
public class BinarySearch 
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
		boolean f=false;
		int left=0;
		int right=n-1;
		System.out.println("Enter Search element");
		int s=sc.nextInt();
		while(left<=right)
		{
		        int middle=(left+right)/2;
			if(s==middle)
		        {
	     			f=true;
	        	}
		        if(s>middle)
		        {
		              left=middle+1;
		        }
		        else
		        {
	                      right=middle-1;
		        }
		}
	        if(f==true)
		{
			System.out.println("The given number is in the list");
		}
		else
		{
			System.out.println("The given number is not in the list");
		}
	}
}
