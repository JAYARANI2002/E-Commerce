/*
      2. Write a program to find third largest number in an array.

            Input: {10, 5, 11, 100, 15, 12, 13}                                              Output: 13

            Input: {0, 1}                                                                                Output: -1

            Input: {1, 1, 1, 1}                                                                          Output: 1
*/
import java.util.Scanner;
public class ThirdLargest
{
  public static void main(String args[])
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of element in the array");
       int n=sc.nextInt();
       System.out.println("Enter the elements of the array");
       int array[]=new int[n];
       int i,j;
       for(i=0;i<n;i++)
       {
            array[i]=sc.nextInt();
       }
       //sort the array
       for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
             if(array[i]>array[j])
             {
               int t=array[i];
               array[i]=array[j];
               array[j]=t;
             }
           }
      }
      int thirdlarge=0;
      if(n<3)
      {
         thirdlarge=-1;
      }
      else
      {
         thirdlarge=array[2];
      }
      System.out.println("Third Largest in the array :"+thirdlarge);
   }
}
      
