import java.util.Scanner;
public class SumOfTens
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("Enter the array element");
		int a[]=new int[n];
		int sum=30;
		int sum1=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		        if(a[i]==10)
			{
				sum1+=a[i];
			}
		}
			if(sum1==30)
				System.out.println("True");
			else
				System.out.println("False");
	}
}


