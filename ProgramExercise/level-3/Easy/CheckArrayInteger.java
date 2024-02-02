import java.util.Scanner;
public class CheckArrayInteger
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the element");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean f=true;
		for(int i=0;i<n;i++)
		{
	          	if(a[i]==0 || a[i]==-1)
			{
				f=false;
			}
			else
			   f=true;

		
		if(f!=false)
			System.out.println(a[i]);
		}
	}
}


