//Write a program to check if two given strings are anagrams or not.
import java.util.Scanner;
public class Anagrams
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int i,j,count=0;
		if(s1.length()==s2.length())
		{
			for(i=0;i<s1.length();i++)
			{
				for(j=0;j<s1.length();j++)
				{
				if(s1.charAt(i)==(s2.charAt(j)))
			        {
			             count++;
				     break;
				}
				}
		
			}
		}
		if(count==s1.length())
			System.out.println("Anagram");
		else
		{
			System.out.println("Not Anagram");
		}
	}
}
