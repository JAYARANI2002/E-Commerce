//Write a program to reverse a given string without using any built-in function.
import java.util.Scanner;
public class StringReverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String rev="";
		int i;
		char arr[]=s.toCharArray();
		for(i=s.length()-1;i>=0;i--)
		{
			rev+=arr[i];
		}
		System.out.println("Reverse string is: "+rev);
	}
}

