import java.util.Scanner;
public class CheckSpecifiedElements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean f=false;
		for(int i=0;i<n;i++)
		{
			if(a[i]==65 || a[i]==77)
			{
				f=true;
			}
		}
		if(f!=false)
			System.out.println("The array contain Specified elements");
		else
			System.out.println("The array not contain Specified elements");
		
	}
}
