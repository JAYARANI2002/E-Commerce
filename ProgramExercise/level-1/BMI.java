 import java.util.Scanner;
 class BMI
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
		int weight=sc.nextInt();
	        double bmi=(double)(703*weight)/(height*height);
		System.out.println(bmi);
	}
}
