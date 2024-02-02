//Write a program that takes two numbers as input and swaps them without using a temporary variable.
package swap;
import java.util.Scanner;
public class SwapWithoutTemp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Two number");
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      System.out.println("Swap without temporary variable");
      n1=n1+n2;
      n2=n1-n2;
      n1=n1-n2;
      System.out.println("After swaping "+n1 + "and "+n2);
    }
    
  }
