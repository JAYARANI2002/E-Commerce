import java.util.Scanner;
public class OddNoSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
				sum+=2*i-1;
				System.out.println(2*i-1);
		}
		System.out.println("The  sum of Odd Natural number upto "+n +"terms is"+sum);
	}
}
