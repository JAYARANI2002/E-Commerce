import java.util.Scanner;
class QuadraticEquations
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the co-effient of x2:");
		double a=sc.nextDouble();
		System.out.println("Enter the co-effient of x:");
           	double b=sc.nextDouble();
                System.out.println("Enter the co-effient of c:");
		double c=sc.nextDouble();
		double dis=b*b-(4*a*c);
		double sqrtdis=Math.sqrt(dis);
		double root1,root2;
		double deter=-b/(2*a);
		double deter2=sqrtdis/(2*a);
	        if(sqrtdis==0)
		{
			System.out.println("Roots are real and equal");
			root1=deter;
			root2=root1;
			System.out.println("Root :"+root1);
		}
		else if(sqrtdis>0)
		{
			root1=deter+deter2;
			root2=deter-deter2;
			System.out.println("Root are root1="+root1+"root2="+root2);
		}
		else
		{
			double realpart=deter;
			double imaginarypart=Math.sqrt(-dis)/(2*a);
		        System.out.println("Real part" + realpart +"+i"+imaginarypart);
			System.out.println("Real part" + realpart +"-i"+imaginarypart);
		}
		
	}
}

 
                                

