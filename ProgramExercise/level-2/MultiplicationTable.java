import java.util.Scanner;
public class MultiplicationTable
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=12;i++)
		{
			System.out.println(n+" X "+ i +"="+n*i);
		}
	}
}

