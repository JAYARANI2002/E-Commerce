import java.util.Scanner;
public class CheckFloat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		float f=sc.nextFloat();
		if(f>0)
		{
			System.out.println("Positive");
			if(Math.abs(f)>1000000)
				System.out.println("Large");
			else
				System.out.println("small");
                }
		else if(f<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}
}

