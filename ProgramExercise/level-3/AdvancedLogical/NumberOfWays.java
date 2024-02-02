import java.util.Scanner;
public class NumberOfWays
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int totalPath=findPath(row,col);
		int ways= findPath(row,col);
		System.out.println(ways);
	}
	public static int findPath(int row,int col)
	{
                    if(row==1 || col==1)
                    {
                            return 1;
                    }
                    return (findPath(row-1,col)+findPath(row,col-1));
	}

}


