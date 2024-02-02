import java.util.Scanner;
public class HalfDiamond
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=i;k>1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=r;i>=1;i--)
		{
			
			for(int k=1;k<=i;k++)
				System.out.print("*");
			for(int v=i;v>1;v--)
				System.out.print("*");
		
		System.out.println();
		}
	}
	
}

