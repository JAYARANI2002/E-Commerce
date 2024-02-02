//Write a program to print the elements of an array of strings in reverse order.
import java.util.Scanner;
public class ReverseStringArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int i;
		String revWord="";
		String word[]=str.split(" ");
		for(i=word.length-1;i>=0;i--)
		{
                       revWord=revWord + word [i] + " " ;
		}
	       System.out.println(revWord);
}
}


