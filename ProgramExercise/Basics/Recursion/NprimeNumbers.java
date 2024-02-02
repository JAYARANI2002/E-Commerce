//Write a program to generate the first n prime numbers using looping.
import java.util.Scanner;
public class NprimeNumbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int  i,n,p,count,flag;

		System.out.println("Enter the number of prime terms you want!");
    		n=sc.nextInt();
    		System.out.println("First "+n+" prime numbers are :-"); 

		p=2;
    		count=1; 
	    	while(count<=n)
    		{
        		flag=1;
        		for(i=2;i<=p-1;i++)
        		{
            			if(p%i==0)  
				{
	            			flag=0;
	            			break;      
				} 	 
        		}
            		if(flag==1)
            		{
               	 		System.out.print(p+" ") ;
	            		count++;
            		}
        		p++;
    		}
	}
}
