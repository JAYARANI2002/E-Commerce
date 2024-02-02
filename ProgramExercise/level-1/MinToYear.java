import java.util.Scanner;
class MinToYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		int year=min/(60*24*365);
		int day=(min/60/24)%365;
		System.out.println("year="+ year+ "day="+ day);
	}
}
