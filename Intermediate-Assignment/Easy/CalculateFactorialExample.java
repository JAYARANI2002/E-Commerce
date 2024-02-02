//Create a method called "calculateFactorial" that takes an integer as an argument and returns the factorial of the number.
import java.util.Scanner;
public class CalculateFactorialExample
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    System.out.println("Find the factorial of a number "+calculateFactorial(n));
  }
  public static double calculateFactorial(int n)
  {
     double fact=0;
     if(n==1 || n==0)
     {
        fact=1;
     }
     else
     {
         fact=n*calculateFactorial(n-1);
     } 
     return fact;
  }
}
