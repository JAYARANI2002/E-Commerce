//Write a program to find the most frequent character in a given string.
import java.util.Scanner;
public class FrequentCharacter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		int i,j,max=0;
		String s=sc.next();
		int freq[]=new int[256];
		char freqchar=' ';
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			freq[c]++;
		}
		for(i=0;i<freq.length;i++)
		{
			if(freq[i]>max)
			{
				freqchar=(char)i;
				max=freq[i];
			}
		}
		System.out.println(freqchar);

			
	}
}

