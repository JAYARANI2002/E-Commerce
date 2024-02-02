import java.util.Scanner;
public class CheckOrder
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no:)");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd no: ");
		int n2=sc.nextInt();
		System.out.println("Enter 3rd no: ");
		int n3=sc.nextInt();
		if((n1>n2) && (n2>n3) && (n1>n3))
		  System.out.println("Decreasing ");
		else if((n1<n2) && (n2<n3) && (n1<n3))
		  System.out.println("Increasing");
                else
		  System.out.println("Neither Increasing or Decreasing ");
	}
}

