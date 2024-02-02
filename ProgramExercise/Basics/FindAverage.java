//Create a program that reads in a list of numbers from the user and then calculates the average of those numbers.
import java.util.Scanner;
public class FindAverage
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
                int n=sc.nextInt();
                System.out.println("Enter the element of the list");
                int list[]=new int[n];
                int i,sum=0;
		for(i=0;i<n;i++)
	        {
	            list[i]=sc.nextInt();
		    sum+=list[i];
		}
         	System.out.println("The average of the list of the number is "+sum/n);
	}
}

                   		    
