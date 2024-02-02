/*
      7. Write a program to print the distinct numbers from an integer array.

            Input : {1, 4, 5, 3, 1, 5}

            Output: {4, 3}

            Input : {1, 4, 5, 3}

            Output: {1, 4, 5, 3}

            Input : {1, 1}

            Output: {}
*/
import java.util.Scanner;
import java.util.*;
public class DistinctNumber
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of element in the array");
       int n=sc.nextInt();
       System.out.println("Enter the elements of the array");
       int array[]=new int[n];
       int i,j;
       List<Integer> l=new ArrayList<Integer>();
       for(i=0;i<n;i++)
       {
            array[i]=sc.nextInt();
       }
       for(i=0;i<n;i++)
       {
          boolean isDistinct = true;
          for( j=0;j<n;j++)
          {
             if( i!=j && array[i]==array[j])
             {
                 isDistinct = false;
                 break;
             }
          }
          if(isDistinct)
          {
             l.add(array[i]);
          }
          
       }
       System.out.println(l);
  }
}
