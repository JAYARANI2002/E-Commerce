import java.util.Scanner;
public class SubArraySum
{
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                System.out.println("Enter the element");
                int a[]=new int[n];
                for(int i=0;i<n;i++)
                {
                   a[i]=sc.nextInt();
                }
                int targetsum=sc.nextInt();
                int a1=CountPartition(a,targetsum,0);
                if(a1>0)
                   System.out.println("True");
                else
                   System.out.println("False");

        }
        public static int CountPartition(int a[],int sum,int i)
        {
             if(sum==0)
             {
                 return 1;
             }
             if(sum<0)
             {
                 return 0;
             }
             if(i==a.length)
             {
                 return 0;
             }
             return (CountPartition(a,sum-a[i],i+1)+CountPartition(a,sum,i+1));
        }

}
