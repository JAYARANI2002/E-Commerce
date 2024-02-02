import java.util.Scanner;
public class CheckFloatThree
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a Float1 :");
                float f1=sc.nextFloat();
                System.out.println("Enter a Float2 :");
                float f2=sc.nextFloat();
                f1=Math.round(f1*1000);
                f2=Math.round(f2*1000);
                if((f1/1000)==(f2/1000))
                        System.out.println("Both are same upto 3rd decimal");
                else
                        System.out.println("Both are not same");
        }
}


