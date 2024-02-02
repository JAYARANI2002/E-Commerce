import java.util.Scanner;
public class FloydTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of row");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			int k=(i%2==0)?1:0;
                        for(int j=0;j<=i;j++)
			{
				System.out.print(k+" ");
				k=1-k;
			}
			System.out.println(" ");
		}
	}

}
