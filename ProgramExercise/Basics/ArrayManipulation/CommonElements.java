//Write a program to find the common elements between two arrays of integers.
import java.util.Scanner;
public class CommonElements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the first array :");
		int n1=sc.nextInt();
		int a[]=new int[n1];
		int i,j;
		System.out.println("Enter the element of First array");
		for(i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of the second array :");
                int n2=sc.nextInt();
		int b[]=new int[n2];
                System.out.println("Enter the element of Second array");
                for(i=0;i<n2;i++)
                {
                        b[i]=sc.nextInt();
                }
		if(n1>1 && n2>1)
		{
			boolean flag=false;
           	for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				if(a[i]==b[j])
				{
				         System.out.println("Common element"+a[i]);
					 flag=true;
					 break;
				}

			}
		}
		if(flag==false)
			System.out.println("There is no common elements");
		}
		else
		{
			System.out.println("Give more integer in the array");
		}

		

	}
}

