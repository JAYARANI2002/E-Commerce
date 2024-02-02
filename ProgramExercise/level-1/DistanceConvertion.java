import java.util.Scanner;
class DistanceConvertion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int meter=sc.nextInt();
		int hrs=sc.nextInt();
		int min=sc.nextInt();
		int sec=sc.nextInt();
		double km=meter/1000;
		double miles=meter/1609;
		double seconds=(double)(hrs*3600)+(min*60)+sec;
		double hours=(double)hrs+(min/60)+(sec/3600);
		System.out.println("Speed in meters/seconds=" +(double)(meter/seconds));
	        System.out.println("Speed in km/hrs ="+(double)(km/hours));
	        System.out.println("Speed in miles/hrs="+(double)(miles/hours));
	}
}

