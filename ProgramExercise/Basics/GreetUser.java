//Create a program that asks the user for their name and then greets them by name.
import java.util.Scanner;
public class GreetUser
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Hai,Enter your name here");
		String name=in.nextLine();
		System.out.println("Welcome to the class " +name);
	}
}
