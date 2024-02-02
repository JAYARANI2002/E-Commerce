public class MajorityDuplicate
{
	public static void main(String args[])
	{
		int a[]={9,4,3,9,9,4,9,9,8};
		int max=0,index=-1;
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c>max)
			{
				max=c;
				index=i;
			}
		}
                if(max>n/2)
		      System.out.println(a[index]);
		else
			System.out.println("no majority");
	}
}
