public class FindSmallest
{
	public static void main(String args[])
	{
		int a[]={2,3,5,3,1,7,5};
		int small=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					small=a[i];
					a[i]=a[j];
					a[j]=small;
				}
			}

	        }
                System.out.println("First smallest" +a[0]+"Second Smallest"+a[1]);
	}
}

