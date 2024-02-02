/*
       5. Write a program to sort the elements in odd positions in descending order and elements in even positions in ascending order

            Input : {13, 2, 4, 15, 12, 10, 5}

            Output: {13, 2, 12, 10, 5, 15, 4}

            Input : {1, 2, 3, 4, 5, 6, 7, 8, 9}

            Output: {9, 2, 7, 4, 5, 6, 3, 8, 1}
 */
 import java.util.Scanner;
 public class SortingOrder
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
       for(int i=0;i<n;i++)
       {
          for(int j=0;j<n;j++)
          {
              if(j%2==0 && i%2==0  && array[i]>array[j])
              {
                int t=array[i];
                array[i]=array[j];
                array[j]=t;
              }
              if(j%2==1 && i%2==1 && array[i]<array[j])
              {
                int t=array[j];
                array[j]=array[i];
                array[i]=t;
              }
          }
      }
      for(int k:array)
      {
          System.out.print(k + " ");
      }
    }
 }

                      
