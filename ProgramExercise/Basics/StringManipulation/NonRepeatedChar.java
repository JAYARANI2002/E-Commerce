//Write a program to find the first non-repeated character in a given string.
import java.util.Scanner;
public class NonRepeatedChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int i,j;
		char c[]=s.toCharArray();
		for(i=0;i<s.length();i++)
		{
			boolean f=true;
			for(j=0;j<s.length();j++)
			{
				if(c[i]==c[j] && i!=j)
			        {
				   f=false;
				   break;
			        }
			}
		        if(f)
		        {
				System.out.println("The first non repeated character is" +c[i]);
			        break;
		        }
		}
	}
}

		


