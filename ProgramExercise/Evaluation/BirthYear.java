//Develop a program that prompts the user to enter their age and calculates their birth year using the current year.
import java.util.Scanner;
import java.util.Calendar;
public class BirthYear
{
   public static void main(String args[])
   {
     
     Scanner sc=new Scanner(System.in);
     Calendar calendar=Calendar.getInstance();
     System.out.println("Enter the current age");
     int age=sc.nextInt();
     int birthyear,currentyear;
     currentyear=calendar.get(Calendar.YEAR);
     birthyear=currentyear-age;
     System.out.println("Birth Year "+birthyear);
   }
 }
     
