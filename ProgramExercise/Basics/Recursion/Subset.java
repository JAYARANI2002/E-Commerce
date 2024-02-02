//Write a program to generate all possible subsets of a given set using recursion.
import java.util.Scanner;
public class Subset
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		subset(s,"",0);
	}
	private static void subset(String s,String current,int index)
	{
		if(index==s.length())
		{
			System.out.println(current);
			return ;
		}
		subset(s,current+s.charAt(index),index+1);
		subset(s,current,index+1);
	}
}
