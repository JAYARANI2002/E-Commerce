//Develop a program that takes an integer as input and displays the multiplication table for that number using nested loops.
import java.util.Scanner;
public class MultiplicationTable
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println("Multiplication Table");
     int i,j;
     for(i=0;i<=5;i++)
     {
         System.out.println("Multiplication table of "+i);
         for(j=0;j<=10;j++)
        {
           System.out.println(i+"X"+j+"="+j*i);
        }
        System.out.println("-----------------------");
     }
   }
}
        
