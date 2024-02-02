//2. Write a Java program to sum values of an array
import java.util.Scanner;
public class AddMatrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nxm matrix size");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int c[][]=new int[n][n];
		System.out.println("Enter the matrix1 element");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int b[][]=new int[n][n];
                System.out.println("Enter the matrix2 element");
		for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n;j++)
                        {
                                b[i][j]=sc.nextInt();
                        }
                }
		System.out.println("Addition of the Matrix");
		for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n;j++)
                        {
                              c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n;j++)
                        {
				System.out.println(c[i][j]);
			}
		}
	}
}




