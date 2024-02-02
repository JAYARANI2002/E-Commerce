import java.util.Scanner;
public class SumAndAverage
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=0;
		float avg;
		for(int i=1;i<n;i++)
		{
			sum+=i;
			System.out.println(" "+i);
		}
		avg=(float)sum/n;
		System.out.println("Average="+avg);
	}
}


