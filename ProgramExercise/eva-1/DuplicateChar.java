import java.util.Scanner;
public class DuplicateChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
                        a[i]=sc.nextInt();
		}
	        for(int i=0;i<str.length();i++)
                { 
			int c=0;
		        for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j] && ch[i]!='')
				{
				    	c++;
			        	ch[j]='0';
				}
			}
		 
		if(c==1 && ch[i]!='0')
		    System.out.println(ch[i]);
		}
	}
}

