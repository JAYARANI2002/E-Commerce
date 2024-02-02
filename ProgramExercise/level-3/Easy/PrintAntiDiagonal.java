public class PrintAntiDiagonal
{
	public static void main(String args[])
	{
		int a[][]={{1,2},{3,4}};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int row=0,col=i;
			while(col>=0)
			{
				System.out.print(a[row][col]);
				row++;
				col--;
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			int row=i,col=n-1;
			while(row<n)
			{
				System.out.print(a[row][col]);
				row++;
				col--;
			}
			System.out.println();
		}
	}
}

