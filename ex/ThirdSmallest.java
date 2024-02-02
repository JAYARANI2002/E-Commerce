import java.util.*;
import java.io.*;

public class ThirdSmallest
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements of the array");
        int i;
        for(i=0;i<n;i++)
        {
           array[i]=sc.nextInt();
          
        }
        for(int j=0;j<n;j++)
        {
           for(int k=j+1;k<n;k++){
           if(array[j]<array[k])
           {
              int t=array[j];
              array[j]=array[k];
              array[k]=t;
          }
          }
       }
       /* for(int k=0;k<n;k++)
        {
           System.out.print(array[k]+ " ");
        }
      */
      System.out.println(Arrays.toString(array));
      System.out.println("Third highest:  "+array[2]);
    }   
}
