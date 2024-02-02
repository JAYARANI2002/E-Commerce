//Develop a program that takes two arrays of integers and finds the common elements between them.
import java.util.Scanner;
public class CommonElements
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size");
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,j;
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
      for(i=0;i<n;i++)
      {
          for(j=0;j<n1;j++)
          {  
              if(a[i]==b[j])
              {
                  System.out.println(a[i]);
                  break;
              }
          }
          
      }
   }
   
}
