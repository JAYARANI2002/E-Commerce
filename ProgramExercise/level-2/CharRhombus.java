import java.util.Scanner;
public class CharRhombus
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{       
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(j+65));
			}
			for(int k=i;k>=0;k--)
			{
                                System.out.print((char)(k+65));
			}
			System.out.println(" ");
		}
		for(int i=n;i>=0;i--)
		{
	                for(int j=0;j<i;j++)
                        {       
                          System.out.print((char)(j+65));
		        }
			for(int k=i;k>=0;k--)
			{
				System.out.print((char)(k+65));
			}
                        System.out.println(" ");
		}
		
	}
}

