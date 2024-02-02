import java.util.Scanner;
public class Pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println((char)n);
		for(int i=-n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
			     System.out.print(-j);
		        }
			System.out.println();
		}
		 for(int i=2;i<=-n;i++)
                {
                        for(int j=1;j<=i;j++)
                        {
                             System.out.print(-j);
                        }
                        System.out.println();
                }

	}

}

