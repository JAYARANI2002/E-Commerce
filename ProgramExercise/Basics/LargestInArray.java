//Write a program to find the largest element in an array of integers.
import java.util.Scanner;
public class LargestInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
	        int n=sc.nextInt();
	        System.out.println("Enter the elements");
	        int array[]=new int[n];
	        int i,largest=0;
		for(i=0;i<n;i++)
		{
		   array[i]=sc.nextInt();
		   if(array[i]>largest)
		   {
			   largest=array[i];
		   }
	        }
		System.out.println("Largest element in the array "+largest);
	}
}

                		
