import java.util.Scanner;
public class SumEqualToGivenValue
{
	public static void main(String args[])
	{
                     Scanner sc=new Scanner(System.in);
                     System.out.println("Enter size");
                     int t=sc.nextInt();
                     System.out.println("Enter the element");
                     int a[]=new int[t];
                     for(int i=0;i<t;i++)
                     {
                        a[i]=sc.nextInt();
                     }
		     for(int i=0;i<t;i++)
		     {
			     int sum+=a[i];
		     }
		     if(sum==TargetValue)
			     System.out.println("Sum is matched to Target");
		     else
			    System.out.println("Sum is not matched to target");
		}
	}

}
