import java.util.Scanner;
public class ComputeAverage
{
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter size");
              int t=sc.nextInt();
              int k;
              System.out.println("Enter the element");
              int a[]=new int[t];
              for(int i=0;i<t;i++)
              {
                      a[i]=sc.nextInt();
              }
              for(int i=0;i<t;i++)
              {
                      for(int j=i+1;j<t;j++){
                      if(a[i]>a[j])
                      {
                              k=a[i];
                              a[i]=a[j];
                              a[j]=k;
                      }
                      }
              }
              int largest=a[t-1];
	      System.out.println(largest);
	      int smallest=(a[0]);
	      System.out.println(smallest);
	      int sum=0,c=t-2;
	      for(int i=0;i<t;i++)
	      {
		      if(a[i]!=largest && a[i]!=smallest)
		      {
			      sum+=a[i];
		      }
	      }
	      System.out.println("Sum:"+sum+"Count"+c);
	      System.out.println(sum/c);

	}
}


