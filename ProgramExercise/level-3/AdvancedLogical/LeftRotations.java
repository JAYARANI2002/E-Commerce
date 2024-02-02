import java.util.Scanner;
public class LeftRotations 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int rotation,i=0,j=n-1;
		System.out.println("Enter the number of rotations");
		rotation=sc.nextInt();
		rotate(a,rotation);
		for(int t:a)
                {
                        System.out.print(t+"");
                }

	}
	public static void rotate(int a[],int rotation)
	{
		int l=a.length;
		rotation=rotation%l;
		reverse(a,0,rotation-1);
		reverse(a,rotation,l-1);
		reverse(a,0,l-1);
	}
	public static void reverse(int a[],int i,int j)
	{
		while(i<j)
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			i++;
			j--;
		}
	}
 

}
