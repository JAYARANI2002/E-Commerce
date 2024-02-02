import java.util.Scanner;
public class SpecificSumPair
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Specified sum");
		int sum=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				int sum1=arr[i]+arr[j];
				if(sum1==sum){
				for(int k=0;k<n;k++)
				{
					if(arr[k]==sum)
					{
						System.out.println("Sum of "+arr[i]+" and "+arr[j]+"="+sum+"Present in the array");
					}
				}
				}
			}

		}
	}
}

			  
