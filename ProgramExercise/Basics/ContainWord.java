//Create a program that asks the user to enter a string and then checks whether the string contains the word "Java". If it does, print out "The string contains Java." If it doesn't, print out "The string does not contain Java."
import java.util.Scanner;
public class ContainWord
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String[] words=s.split(" ");
		System.out.println("Enter the search word");
		String searchWord=sc.next();
		int word;
		boolean f=false;
		for(word=0;word<words.length;word++)
		{
			if(words[word].equals(searchWord))
			{
				f=true;
			}
		}
		if(f==true)
                {
                     System.out.println("The string contain "+searchWord);
		}
		else
		{
			System.out.println("The string does not contain "+searchWord);
		}
	}
}


