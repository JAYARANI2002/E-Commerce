import java.util.Scanner;
public class TestEquality
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		boolean f=false;
		for(int i=0;i<n1;i++)
			a[i]=sc.nextInt();
		for(int j=0;j<n2;j++)
			b[j]=sc.nextInt();
		if(n1!=n2)
		{
			System.out.println("Array is not equal");
		}
		else
		{
			for(int i=0;i<n1;i++)
			{
			               if(a[i]==b[i])
					{
						f=true;
					}
				}
			}
		}
		if(f==true)
			System.out.println("Array is equal");
		else
			System.out.println("Array is not equal");
	}
}

						



