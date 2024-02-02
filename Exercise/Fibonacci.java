//4. Write a program to generate Fibonacci series up to given number 'n'. 
import java.util.Scanner;
public class Fibonacci 
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=2;
        int first=0;
        int second=1;
        System.out.print(first + " "+second +" ");
        while(i<n && n>2)
        {
           
           int next=first+second;
           System.out.print(next+" ");
           first=second;
           second=next;
           i++;
        }
    }
}
