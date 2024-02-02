public class TrianglePattern
{
   public static void main(String args[])
   {
       int n=5,i,j;
       for(i=0;i<n;i++)
       {
            for(j=0;j<n;j++)
            {
                if(j>n-i)
                {
                   System.out.print("* ");
                }
                else
                {
                  System.out.print(" ");
                }
            }
            System.out.println();
       }
       for(i=n;i>0;i--)
       {
            for(j=n;j>0;j--)
            {
                if(j<i)
                {
                   System.out.print("* ");
                }
                else
                {
                  System.out.print(" ");
                }
            }
            System.out.println();
       }
    }
}
