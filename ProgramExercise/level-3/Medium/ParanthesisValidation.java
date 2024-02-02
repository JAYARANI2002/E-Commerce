import java.util.Scanner;
public class ParanthesisValidation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the message with paranthesis");
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		int count=0,openpos=0,closepos=0;
		for(int i=0;i<s.length();i++)
		{
		     if(c[i]=='(')
		     {
			     if(count==0)
			     {
				     openpos=i;
			     }
			     count++;
		     }
		     else if(c[i]==')')
		     {
			     count--;
			     if(count==0)
			     {
				     System.out.println("Paranthesis open at "+openpos+" Close at  "+i);
			     }
		     }

		}
			
	}
}



