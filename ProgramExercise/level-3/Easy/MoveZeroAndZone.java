import java.util.Scanner;
public class MoveZeorAndOne
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the element");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i <n; i++) 
		{
                   int left=0;
                   int right=arr.length-1;
                   while(arr[left]==0)
                   {
                       left++;
                   }
                   while(arr[right]==1)
                   {
                       right--;
                   }

                   if(left<right)
                   {
                      int temp=arr[left];
                      arr[left]=arr[right];
                      arr[right]=temp;
                   }
                }
		for(int i=0;i<n;i++)
                {
			System.out.println(arr[i]);
		}

	}
}
