/*
      8. Write a program to print the index of the given element in an array.

            Input : {1, 5, 3, 7}, 1

            Output: 0

            Input : {10, 22, 33, 25, 32, 54, 64, 1}, 100

            Output: -1
*/
import java.util.Scanner; 
public class ReturnIndex
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
       int pos=-1;
       System.out.println("Enter the element to return the index");
       int search=sc.nextInt();
       for(i=0;i<n;i++)
       {
           if(array[i]==search)
           {
               pos=i;
           }
       }
       System.out.println(pos);
     }
  }
           
               
      
