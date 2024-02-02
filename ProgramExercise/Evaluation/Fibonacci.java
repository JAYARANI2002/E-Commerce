//Build a program that prints the Fibonacci series up to a given number using a while loop.
import java.util.Scanner;
public class Fibonacci
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number to find the fibonacci series upto this number");
    int n=sc.nextInt();
    int first=0,second=1,i=2,next,c=0;
    while(first<=n )
    {
       System.out.println(first);
       c++;
       if(c==n)//print the n fibonacci number
         break;
       next=first+second;
       first=second;
       second=next;
     }
  }
}
