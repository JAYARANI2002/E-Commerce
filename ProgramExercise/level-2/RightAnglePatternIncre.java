import java.util.Scanner;
public class RightAnglePatternIncre
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		int k=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++);
			}
			System.out.println(" ");
		}
		}
}
