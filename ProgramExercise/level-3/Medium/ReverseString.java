import java.util.Scanner;
public class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int n=s.length();
		String reverse="";
		for(int i=n-1;i>=0;i--)
		{
			reverse+=ch[i];
		}
		System.out.println(reverse);
	}
}


