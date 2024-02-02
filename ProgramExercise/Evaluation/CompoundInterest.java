//Develop a program that calculates the compound interest for a given principal amount, interest rate, and time period.
import java.util.Scanner;
public class CompoundInterest
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner (System.in);
     System.out.println("Prinicipal amount");
     float pamt=sc.nextFloat();
     System.out.println("Interest Rate");
     float interest=sc.nextFloat();
     System.out.println("Time Period");
     int time=sc.nextInt();
     //compount interest=p((1+r/100)^n)
     double compoundInterest=pamt*(Math.pow(1+(interest/100),time));
     System.out.println("Compound interest"+compoundInterest);
    }
  }
