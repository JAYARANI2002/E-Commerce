import java.util.Scanner;
public class MinimumDistance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String word[]=s.split("//s");
		String word1=sc.nextLine();
		String word2=sc.nextLine();
		int firstpos=0;
		int secondpos=0;
		String search;
		System.out.println(word);
		int n=s.length();
		for(int t=0;t<=n;t++)
		{
			search=word[t];
			if(search==word1)
				firstpos=t;
                        if(search==word2)
				secondpos=t;
		}
		int diff=Math.abs(firstpos-secondpos);
		System.out.println(diff);
	}
}

