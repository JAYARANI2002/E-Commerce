//Write a program to capitalize the first letter of each word in a given string.
import java.util.Scanner;
public class CapitalizeFirstLetter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int i;
		char arr[]=s.toCharArray();
		arr[0]=(char)((int)arr[0]-32);
		for(i=1;i<=s.length()-1;i++)
		{
			
			if(arr[i]==' ' )
			{
				arr[i+1]=(char)((int)arr[i+1]-32);
			}
                }
		System.out.println(arr);
	}
}
