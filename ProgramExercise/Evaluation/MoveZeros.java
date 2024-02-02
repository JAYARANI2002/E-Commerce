//Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements
import java.util.Scanner;
public class MoveZeros
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size of the  array");
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,j,temp;
      System.out.println("Enter the elements");
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
         for(j=i;j<n;j++)
         {
            if(a[i]==0)
            {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
         }
      }
      for(int v:a)
         System.out.println(v);
    }
 }
            
