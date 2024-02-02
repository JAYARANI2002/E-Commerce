import java.util.Scanner;
class ValueInteger
{
	public static void main(String args[])

	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
	         System.out.println("The value of the n=1 ");
		else if(n<0)
	         System.out.println("The value of the n=-1 ");
		else
	         System.out.println("The value of the n=0");
	}
}
