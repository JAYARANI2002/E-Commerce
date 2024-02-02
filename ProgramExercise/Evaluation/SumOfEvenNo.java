//Write a program that takes an array of integers and returns the sum of all even numbers in the array.
import java.util.Scanner;
public class SumOfEvenNo
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size");
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,sum=0;
      System.out.println("Enter the elements");
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      for(i=0;i<=n-1;i++)
      {
          if(a[i]%2==0)
          {
              sum+=a[i];
          }
      }
      System.out.println(sum);
      }
   }
