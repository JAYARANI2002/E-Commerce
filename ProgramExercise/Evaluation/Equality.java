import java.util.Scanner;
public class Equality
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size of the first array");
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,j;
      System.out.println("Enter the elements");
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      System.out.println("Size of the second array");
      int n1=sc.nextInt();
      int b[]=new int[n];
      System.out.println("Enter the elements of 2nd array");
      for(i=0;i<n1;i++)
      {
          b[i]=sc.nextInt();
      }
      boolean f=false;
      if(n==n1)
      {
           for(i=0;i<=n-1;i++)
           {
              if(a[i]==b[i])
              {
                 f=true; 
              }
          
           }
      }
      if(f==true)
      {
         System.out.println("Array is equal");
      }
      else
         System.out.println("Array is not equal");
   }
   
}
