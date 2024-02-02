import java.util.Scanner;
public class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.ou.println((int)s);
		char c[]=s.toCharArray();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
                   rev+=c[i];
		}
		System.out.println(rev);
	}
}
