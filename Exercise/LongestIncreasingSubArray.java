/*      9. Find the longest increasing sub-array in array. [Note - If there are multiple possibilities, print the first possibility.]

            Input : {1, 5, 3, 7}

            Output: {1, 5}

            Input : {10, 22, 33, 25, 32, 54, 64, 1}

            Output: {25, 32, 54, 64}
*/
import java.util.Scanner;
public class LongestIncreasingSubArray
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);       
       System.out.println("Enter the no of element in the array");
       int n=sc.nextInt();
       System.out.println("Enter the elements of the array");
       int array[]=new int[n];
       int i,j,size=1;
       int max=1,index=0;
       for(i=0;i<n;i++)
       {
            array[i]=sc.nextInt();
       }
       for(i=1;i<n;i++)
       {
          if(array[i]>array[i-1])
          {
              size++;
          }
          else
          {
              if(max<size)
              {
                 max=size;
                 index=i-max;
              }
              size=1;
           }
       }
       if(max<size)
       {
           max=size;
           index=n-max;
       }
       for(int k=index;k<max+index;k++)
       {
           System.out.print(array[k]+" " );
       }
     }
  }
        
          
       
