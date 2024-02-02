//Create a method called "calculateAverage" that takes an array of integers as an argument and returns the average of the numbers in the array.
import java.util.Scanner;
public class AvgOfArray
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
       System.out.println("Calculate average"+calculateAverage(array));
   }
   public static int calculateAverage(int[] a)
   {
          int size=a.length;
          int sum=0,avg=0;
          for(int element=0;element<size;element++)
          {
              sum+=a[element];
          }
          avg=sum/size;
          return avg;
   }
}
