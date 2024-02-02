import java.util.Scanner;
public class CyclicRotate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int rotation=1,i=0,j=n-1;
		while(i!=j)
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			i++;
		}
                for(int t:a)
		{
			System.out.print(t+"");
		}
	}
}


