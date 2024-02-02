//Build a program that calculates the area of a circle, given the radius entered by the user.
import java.util.Scanner;
public class AreaOfCircle
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    double r=sc.nextDouble();
    final double PI=3.14d;
    double area=PI*r*r;
    System.out.println("Area of the circle "+area);
  }
 }

