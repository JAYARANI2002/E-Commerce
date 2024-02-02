import java.util.Scanner;
public class StringDuplicate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Length of the array");
		int n=sc.nextInt();
		String s[]=new String[n];
		System.out.println("Enter the string");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		System.out.println("Duplicated String");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((s[j]).equals(s[i]))
					System.out.println(s[j]);
			}
		}
	}
}

