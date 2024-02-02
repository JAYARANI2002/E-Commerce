import java.util.Scanner;
public class CheckEquality
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
		int n1=sc.nextInt();
		System.out.println("Enter n2");
		int n2=sc.nextInt();
		System.out.println("Enter n3");
		int n3=sc.nextInt();
		if((n1==n2) && (n2==n3) && (n1==n3))
		{
			System.out.println("All numbers are qual");
		}
		else if((n1!=n2) || (n2!=n3) ||(n3!=n1))
			System.out.println("All numbers are different");
		else
			System.out.println("Neither all are equal or different");
	}

}

