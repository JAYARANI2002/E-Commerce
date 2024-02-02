//Write a program to remove all the white spaces from a given string.

import java.util.Scanner;
public class RemoveSpace
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
	        String s=sc.nextLine();
		int i,j;
		char c;
		String modify="";
		for(i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			if(c!=' ')
			{
				modify+=c;
			}
		}
		System.out.println(modify);
	}
}

				
		       	
