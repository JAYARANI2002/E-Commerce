import java.util.Scanner;
public class DayInMonth
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Year");
		int year=sc.nextInt();
		System.out.println("Enter the month");
		int month=sc.nextInt();
		String day="";
		if(year%4==0 && year/100!=0 || year%400==0)
		{
			if(month==2)
				day="29 days";
		}
		if(month<=7 && month%2==1)
		{
			day="31 days";
		}
		else if(month==2)
			day="28 days";
		else if(month>7 && month%2==0)
			day="31 days";
		else
			day="30 days";
	
	System.out.println(day);
	}
}
