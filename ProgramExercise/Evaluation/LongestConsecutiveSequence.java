import java.util.Scanner;
public class LongestConsecutiveSequence 
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size");
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,t,max=0,count=0,j,temp;
      System.out.println("Enter the elements");
      for(t=0;t<n;t++)
      {
          a[t]=sc.nextInt();
      }
      System.out.println("Find Longest consecutive length");
      for(i=0;i<n;i++)
      {
         count=1;
         temp=a[i];
         for(j=0;j<n;j++)
         {
            if(temp==a[j]-1)
            {
               temp=a[j];
               count++;
               j=0;
             }
          }
          if(count>max)
          {
                max=count;
          }
       }
       System.out.println("Longest consecutive sequence length= "+max);
    }
}
