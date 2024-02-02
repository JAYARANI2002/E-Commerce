//Build a simple calculator program that allows the user to enter two numbers and perform basic arithmetic operations (addition, subtraction, multiplication, and division).
import java.util.Scanner;
public class Calculator
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number1");
      int n1=sc.nextInt();
      System.out.println("Enter the number2");
      int n2=sc.nextInt();
      System.out.println("Arithmetic operations");
      System.out.println("Addition  "+(n1+n2));
      System.out.println("Subtraction  "+(n1-n2));
      System.out.println("Multiplication  "+n1*n2);
      System.out.println("Division  "+n1/n2);
  }
}
      
