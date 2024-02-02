import java.util.Scanner;
public class Sort
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int n[]={0,-1,0,-1,0,-1,0,-1};
      for(int i=0;i<n.length;i++)
      {
          for(int j=0;j<n.length;j++)
          {
            if(n[i]>n[j])
            {
                int t=n[j];
                n[j]=n[i];
                n[i]=t;
            }
          }
      }
      for(int x:n)
      {
        System.out.print(x+" ");
      }
   }
}
