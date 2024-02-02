//Develop a program that takes the user's input in meters and converts it to feet, inches, and centimeters.
import java.util.Scanner;
public class MeterInto
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the input in meters");
    float n=sc.nextFloat();
    //1 inch=0.025m;
    float inch=(float)(n/0.025);
    //1 feet=0.3048m
    float feet=(float)(n/0.3048);
    //1 meter=100cm
    float cm=n*100;
    System.out.println("Meter into feet"+feet);
    System.out.println("Meter into inches"+inch);
    System.out.println("Meter into Centimeters"+cm);
  }
}    
