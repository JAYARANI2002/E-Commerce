import java.util.Scanner;
public class SortArray
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
		         	{
			        	int t=arr[i];
				        arr[i]=arr[j];
			        	arr[j]=t;
				}
			}
		}
		int max_idx =n - 1, min_idx = 0;
                int max_elem = arr[n- 1] + 1;
                for (int i = 0; i <n; i++) 
		{
		       	if (i % 2 == 0) 
			{
				arr[i] += (arr[max_idx] % max_elem) * max_elem;
                                max_idx--;
                        }
	        	else 
		        {
		       	        arr[i] += (arr[min_idx] % max_elem) * max_elem;
                                min_idx++;
                        }
                }
	        for (int i = 0; i <n; i++)
                    arr[i] = arr[i] / max_elem;
	        for(int i:arr)
		    System.out.println(i);
	}
}
