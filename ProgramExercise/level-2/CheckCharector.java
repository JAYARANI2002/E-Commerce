import java.util.Scanner;
import java.lang.String.*;
public class CheckCharector
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		String ch=sc.next();
		ch=ch.toLowerCase();
		if(ch.length()>1)
		{
			System.out.println("Error");
		}
		else if(ch.equals("a") || ch.equals("e") || ch.equals("i")|| ch.equals("o") || ch.equals("u"))
		{
		       System.out.println("The charecter is vowels");
		}
		else
		{
	               System.out.println("The charecter is consonant");
		}
		
	      
	}
}

