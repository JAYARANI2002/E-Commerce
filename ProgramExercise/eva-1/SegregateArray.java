import java.util.Scanner;
public class SegregateArray
{
	public static void main(String args[])
	{
	      Scanner sc=new Scanner(System.in);
              System.out.println("Enter size");
              int n=sc.nextInt();
              System.out.println("Enter the element");
              int a[]=new int[n];
              for(int i=0;i<n;i++)
              {
                      a[i]=sc.nextInt();
              }
              for(int i=0;i<n;i++)
	      {
			if(a[i]==1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[j]!=0)
					{
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
			}
			if(a[i]==0)
			{
                                for(int j=0;j<n;j++)
                                {
                                        if(a[j]!=0)
                                        {
                                                int t=a[i];
                                                a[i]=a[j];
                                                a[j]=t;
                                        }
                                }
                        }
		}
	      for(int i:a)
		      System.out.print(i+" ");
	}
}
