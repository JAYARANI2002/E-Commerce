import java.util.Scanner;
public class PrintCommon
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenght of the array");
		int l1=sc.nextInt();
		int l2=sc.nextInt();
		String s1[]=new String[l1];
		String s2[]=new String[l2];
		System.out.print("Enter the array s1");
		for(int i=0;i<l1;i++)
			s1[i]=sc.next();
		System.out.println("enter array element s2");
		for(int i=0;i<l2;i++)
                        s2[i]=sc.next();
		System.out.println("Print Common element");
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l2;j++)
			{
				if(s1[i].equals(s2[j]))
					System.out.println(s1[i]);
			}
		}
	}
}

