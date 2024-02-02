import java.util.Scanner;
public class DisplayCube
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cube;
		for(int i=1;i<=n;i++)
		{
			cube=i*i*i;
			System.out.println("Number "+i +" cube is" +cube);
		}
	}
}
