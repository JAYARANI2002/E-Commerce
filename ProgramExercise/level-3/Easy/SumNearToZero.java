import java.util.Scanner;
public class SumNearToZero
{
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter size");
              int t=sc.nextInt();
              System.out.println("Enter the element");
              int a[]=new int[t];
              for(int i=0;i<t;i++)
              {
                      a[i]=sc.nextInt();
              }
	      boolean f=false;
	      for(int i=0;i<t;i++)
	      {
		      for(int j=0;j<t;j++)
		      {
			     int sum=a[i]+a[j];
			     if(sum>=0 ||sum<=1 )
			      {
                                  f=true;
			      }
		      }
	      }
	      if(f==true )
	      {
		      System.out.println("Sum is close to zero");
	      }
              else
                System.out.println("Sum is not closed to zero");
	      
	}
}

