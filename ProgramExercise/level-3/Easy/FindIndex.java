import java.util.Scanner;
public class FindIndex
{
	public static void main(String args[])
	{
	        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the search element");
		int s=sc.nextInt();//Search Element
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==s)
			{
				System.out.println("The given element "+a[i]+" present in "+i+" position");
			}
		}

	}

}
