import java.util.Scanner;
public class PrintCommonIntegers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array1 length");
		int n1=sc.nextInt();
                System.out.println("Enter the Array2 length");
		int n2=sc.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
                System.out.println("Enter the element Array1");
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
        	System.out.println("Enter the element Array2");
                for(int j=0;j<n2;j++)
		{
		       b[j]=sc.nextInt();
		}
		System.out.println("Print Common integer");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}


