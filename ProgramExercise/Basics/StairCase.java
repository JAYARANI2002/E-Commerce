//Staircase pattern of stars:
import java.util.Scanner;
public class StairCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int step=sc.nextInt();
		int i,j;
		for(i=0;i<step;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
