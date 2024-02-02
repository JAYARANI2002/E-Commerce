import java.util.Scanner;
class DisplayWeekDay
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number"):
	        int n=sc.nextInt();
		String day="";
		switch(n)
		{
			case 1:
				day="Sunday";
				break;
			case 2:
				day="Monday";
				break;
		        case 3:
                                day="Tuesday";
                                break;
                        case 4:
                                day="Wednesday";
                                break;
                        case 5:
                                day="Thursday";
                                break;
                        case 6:
                                day="Friday";
                                break;
                        case 7:
                                day="Saturday";
                                break;
			default:
                                day="Enter valid no";
		}
		System.out.println("The day is" +day);
	}
}
				
