/*Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.

Sample array: [1,2,4,5,6] 

Target value: 6. */
 import swap.*;  
import java.util.Scanner;
public class SumOfTarget
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size");
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,sum=0,j;
      System.out.println("Target sum");
      int target=sc.nextInt();
      System.out.println("Enter the elements");
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
          for(j=1;j<n;j++)
          {
             sum=a[i]+a[j];
             if(sum==target)
                System.out.println(a[i]+" + "+a[j]+"= " + target  );
           }    
      }
      System.out.println("swap numbers"+SwapWithoutTemp(2,3));
      }
   }
