import java.util.Scanner;
public class SumEqualToNumber
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				sum=arr[i]+arr[j];
				for(int k=0;k<n;k++)
				{
					if(arr[k]==sum)
					{
						System.out.println("Sum of "+arr[i]+" and "+arr[j]+"="+sum);
					}
				}
			}

		}

	}
}


