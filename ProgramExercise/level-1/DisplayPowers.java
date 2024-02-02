import java.util.Scanner;
class DisplayPowers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sqrt=n*n;
		int cube=sqrt*n;
		System.out.println("Square root="+sqrt);
		System.out.println("Cube root=" + cube);
		System.out.println("Forth root="+cube*n);
	}
}

