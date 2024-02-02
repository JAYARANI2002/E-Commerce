import java.util.Scanner;
class BubbleSort
{

	public static void main(String[] args)
	{
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.next();
		}
		String temp;
		for (int j = 0; j < n - 1; j++) 
		{
			for (int i = j + 1; i < n; i++) 
			{
				if (arr[j].compareTo(arr[i]) > 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}
}
