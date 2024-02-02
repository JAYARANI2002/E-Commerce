import java.util.Scanner;
public class SecondSmallest
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the length");
                int n=sc.nextInt();
                int a[]=new int[n];
                int t;
                System.out.println("Enter the element");
                for(int i=0;i<n;i++)
                {
                        a[i]=sc.nextInt();
                }
                for(int i=0;i<n;i++)
                {
                        for(int j=i+1;j<n;j++)
                        {
                                if(a[i]>a[j])//ascending Order
                                {
                                        t=a[i];
                                        a[i]=a[j];
                                        a[j]=t;
                                }
                        }
                }
                System.out.println("Second Smallest"+a[1]);
        }
}
