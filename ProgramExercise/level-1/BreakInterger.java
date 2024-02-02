import java.util.Scanner;
import java.lang.*;
class BreakInteger
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		while(n!=0)
                {
                        int i=n%10;
                        rev=rev*10+i;
                        n=n/10;
                }

		while(rev!=0)
		{
			int i=rev%10;
			System.out.print(i);
			rev=rev/10;
		}
	}
}

