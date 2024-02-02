//Declare two variables of type int called num1 and num2. Assign them values of your choice. Write a program that compares num1 and num2 and prints out whether num1 is greater than, less than, or equal //to num2.
import java.util.Scanner;
public class CompareTwoNo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		if(num1==num2)
		{
			System.out.println("The number1 is equal to number2");
		}
		else
		{
			System.out.println(num1>num2?"The number1 is greater than number2":"The number1 is less than number2");
		}
	}
}
