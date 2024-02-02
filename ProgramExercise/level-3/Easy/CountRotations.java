import java.util.Scanner;
public class CountRotations
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int minidx = 0;
                int minno = a[0];
                for (int i = 1; i < n ; i++)
	        {
			if (a[i] < minno)
			{
                             minno = a[i];
                             minidx = i;
                        }
        }
        System.out.println( minidx);
    }
}
