//Write a program to find the length of the longest substring without repeating characters in a given string.

import java.util.Scanner;
public class LongestSubString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to find longest substring ");
		String s=sc.next();
		String substring="";
		int left=0,right=0,max=0;
		char arr[]=s.toCharArray();
		boolean[] visit=new boolean[256];
                while(right<s.length())
		{               
				if(visit[s.charAt(right)])
			        {
                                   while(visit[s.charAt(right)])
				   {
					   visit[s.charAt(left)]=false;
					   left++;
				   }
				}
				visit[s.charAt(right)]=true;
				max=max<right-left+1?right-left+1:max;
				right++;
		}
		System.out.println("The length of the longest Substring "+max);
	}
}

