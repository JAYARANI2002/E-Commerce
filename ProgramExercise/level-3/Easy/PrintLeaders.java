public class PrintLeaders
{
	public static void main(String args[])
	{
		int n[]={4,2,3,7,5};
		int max=0;
		for(int i=n.length-1;i>=0;i--)
		{
			if(n[i]>max)
			{
				  System.out.println(n[i]+" ");
			          max=n[i];
			}
		}
	}
}

