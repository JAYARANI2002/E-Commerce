//Create a method called "findMax" that takes an array of integers as an argument and returns the largest number in the array.
import java.util.Scanner;
public class LargestNumber
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of element in the array");
       int n=sc.nextInt();
       System.out.println("Enter the elements of the array");
       int array[]=new int[n];
       for(int i=0;i<n;i++)
       {
            array[i]=sc.nextInt();
       }
       System.out.println("Largest number in the array "+findMax(array));
   }
   public static int findMax(int[] a)
   {
      int max=0;
      for(int i=0;i<a.length;i++)
      {
           max=a[i]>max?a[i]:max;
      }
      return max;
   }
}
