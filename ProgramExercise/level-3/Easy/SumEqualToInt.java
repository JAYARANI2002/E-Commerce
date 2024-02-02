public class SumEqualToInt
{
	public static void main(String args[])
	{
		int a[]={1,2,4,5,6};
		int target=8;	
		boolean f=true;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]+a[j] == target)
			        {
					f=false;
				}
			       
			}
		}
		if(f==false){
		       System.out.println("Sum is matched to target");
		       }
		else{
		 	System.out.println("sum is not matched to target");
		 	}
	}
}

