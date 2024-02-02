import java.util.Scanner;
public class PerfectNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Calculate Perfect or not");
		int c=0;
		for(int i=19;;i+=9)
		{
			int sum=0;
			for(int j=i;j>0;j=j/10)
			{
				sum+=j%10;
			}
			if(sum==10)
			{
				c++;
			}
			if(c==n)
			{
				System.out.println(i);
				break;
			}
		}
	}
}

