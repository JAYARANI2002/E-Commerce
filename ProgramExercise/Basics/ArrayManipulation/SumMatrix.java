//Write a program to find the sum of two matrices of the same size.
import java.util.Scanner;
public class SumMatrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix1 row");
		int r1=sc.nextInt();
		System.out.println("Enter the matrix1 col");
		int c1=sc.nextInt();
		int a[][]=new int[r1][c1];
		System.out.println("Enter the element of matrix1");
		int i,j;
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
		        }
		}
		System.out.println("Enter the matrix2 row");
                int r2=sc.nextInt();
                System.out.println("Enter the matrix2 col");
                int c2=sc.nextInt();
                int b[][]=new int[r2][c2];
                System.out.println("Enter the element of matrix2");
                for(i=0;i<r2;i++)
                {
                        for(j=0;j<c2;j++)
                        {
                                b[i][j]=sc.nextInt();
                        }
                }
		if(r1==r2 && c1==c2)
		{
			System.out.println("Sum of two matrix");
		        for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					a[i][j]=a[i][j]+b[i][j];
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("two matrix must be same");
		}
	}
}
