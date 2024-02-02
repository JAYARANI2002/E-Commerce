import java.util.Scanner;
public class MoveZeros
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
		System.out.println("Move zeros");
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[j]!=0)
					{
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
			}
		}
		for(int i:a)
			System.out.println(i);
	}
}

