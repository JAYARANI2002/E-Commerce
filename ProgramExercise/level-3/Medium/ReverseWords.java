import java.util.Scanner;
public class ReverseWords
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the message");
		String s=sc.nextLine();
		String rev="";
		String words=s.split();
		for(int t=s.length()-1;t>=0;t--)
		{
		        rev+=words;
		}
		System.out.println(rev);
	}
}
