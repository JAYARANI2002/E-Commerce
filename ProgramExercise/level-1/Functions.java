import java.lang.Math;
import java.util.Scanner;
class ArithmaticFunctions
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		int min=a<b?a:b;
		int max=a>b?a:b;
		System.out.println("Sum of two integers :" +sum);
		System.out.println("Difference of two numbers "+ (a-b));
		System.out.println("Product of the numbers "+a*b);
		System.out.println("Average of the numbers"+sum/2);
		System.out.println("Distance of two numbers" + Math.abs(a-b));
		System.out.println("Maximum :"+max);
		System.out.println("Minimum:"+min);
	}
}

