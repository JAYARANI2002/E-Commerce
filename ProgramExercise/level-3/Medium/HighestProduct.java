import java.util.Scanner;
public class HighestProduct
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the element");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max1)
			{
				max3=max2;
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2)
                        {
                                max3=max2;
                                max2=a[i];
                        }
			else if(a[i]>max3)
			{
				max3=a[i];
			}
		        if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2)
			{
				min1=a[i];
			}

		}
		int product1=max1*max2*max3;
		int product2=max1*min1*min2;
		if(product1<product2)
		{
			System.out.println("Highest Product is"+product2);
		}
		else
		{
			System.out.println("Highest Product is"+product1);
		}
	}
}

