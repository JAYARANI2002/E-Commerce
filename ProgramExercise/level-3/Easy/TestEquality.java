import java.util.Scanner;
public class TestEquality
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
	       	int n1=sc.nextInt();
		System.out.println("Enter n2"); 
		        int n2=sc.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		System.out.println("Enter Array1 element");
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Array2 element");
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
                }
		if(n1==n2)
		{     
		        boolean flag = false;
			for(int i=0;i<n1;i++)
			{
		        
		       
					if(a[i]!=b[i])
				        {
				            flag = true;
				            break;
			                }
			
		      }
			if (flag == true)
			{
			System.out.println("Array is not equal ");
			}
			else 
			{
			 System.out.println("Array is equal");
			 }
	     }
                	 
    }
}

