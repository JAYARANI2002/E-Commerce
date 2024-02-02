import java.util.Scanner;
public class DiffLargeAndSmall
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
	      System.out.println("difference between Largest "+a[t-1]+"and Smallest"+a[0]+"is ="+((a[t-1])-(a[0])));
	}
}

