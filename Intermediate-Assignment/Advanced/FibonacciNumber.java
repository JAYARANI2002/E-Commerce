//Implement a recursive function in Java that calculates the n-th Fibonacci number. Test the function with different values of n.
import java.util.Scanner;
public class FibonacciNumber
{
   public static void main(String args[])
   {
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
       System.out.println(nthFibonacci(n));
   }
   public static int nthFibonacci(int n)
   {
       if (n<=1)
       {
          return n;
       }
       return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
}
