import java.util.Scanner;
public class MoveEvenAndOdd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the element");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		for (int i = 0; i <n; i++)
		{
                   int left=0;
                   int right=n-1;
                   while(a[left]%2==0)
                   {
                       left++;
                   }
                   while(a[right]%2==1)
                   {
                       right--;
                   }

                   if(left<right)
                   {
                      int temp=a[left];
                      a[left]=a[right];
                      a[right]=temp;
                   }
                }
		for(int i=0;i<n;i++)
                {
			System.out.println(a[i]);
		}
	}
}

