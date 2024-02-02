//Write a program to count the number of words in a given string.
import java.util.Scanner;
public class CountWords
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int i,count=0;
		char[] arr=s.toCharArray();
		for(i=0;i<arr.length;i++)
		{
			if(((i>0 && arr[i]!=' ')&&(arr[i-1]==' ') ) ||arr[0]!=' ' && i==0)
			{
				count++;
			}

		}
		System.out.println(count);
	}
}

