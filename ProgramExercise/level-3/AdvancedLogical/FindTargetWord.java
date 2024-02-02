import java.util.Scanner;
public class FindTargetWord
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the column");
		int col=sc.nextInt();
		System.out.println("Enter the search word");
		String str=sc.next();
		int n=str.length();
		System.out.println("Enter the Charachter");
		char[][] c=new char[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				c[i][j]=sc.next().charAt(0);
			}
			System.out.println();
		}
		boolean found=false;
		for(int j=0;j<col;j++)
		{
			int k=0;
			for(int i=0;i<=row-n;i++)
			{
				k=0;
				while(k<n && c[i+k][j]==str.charAt(k))
				{
					k++;
				}
				if(k==n)
				{
					found=true;
					break;
				}
			}
		}
		found=false;
		for(int i=0;i<row;i++)
                {
                        int k=0;
                        for(int j=0;j<=col-n;j++)
                        {
                                k=0;
				while(k<n && c[i][j+k]==str.charAt(k))
                                {
                                        k++;
                                }
                                if(k==n)
                                {
                                        found=true;
					break;
                                }
                        }
                }
		if(found==true)
			System.out.println("The target word is found");
		else
			System.out.println("The target word is not found");
	}
}


		
