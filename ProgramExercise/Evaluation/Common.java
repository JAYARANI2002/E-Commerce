// Write a Java program to find common elements from three sorted (in non-decreasing order) arrays. 
import java.util.Scanner;
public class Common
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size");
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,j,k;
      System.out.println("Enter the elements");
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      System.out.println("Size");
      int n1=sc.nextInt();
      int b[]=new int[n1];
      System.out.println("Enter the elements of 2nd array");
      for(i=0;i<n1;i++)
      {
          b[i]=sc.nextInt();
      }
      System.out.println("Size");
      int n2=sc.nextInt();
      int c[]=new int[n2];
      System.out.println("Enter the elements of 3rd array");
      for(i=0;i<n2;i++)
      {
          c[i]=sc.nextInt();
      }
      int i1=0,j1=0,k1=0;
      while(i1<n && j1<n1 && k1<n2)
      {
         if(a[i1]==b[j1] && b[j1]==c[k1])
         {
            System.out.print(a[i1]+"  ");
            i1++;
            j1++;
            k1++;
         }
         else if(a[i1]<b[j1])
         {
            i1++;
         }
         else if(b[j1]<c[k1])
         {
            j1++;
         }
         else
         {
             k1++;
         }            
            
      }
        
   }
  
}      
