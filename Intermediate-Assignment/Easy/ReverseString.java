//Create a method called "reverseString" that takes a string as an argument and returns the reverse of the string.
import java.util.Scanner;
public class ReverseString
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s=sc.next();
      System.out.println("Reversed String : "+reverseString(s));
   }
   public static String reverseString(String string)
   {
      char[] c=string.toCharArray();
      String rev="";
      for(int i=0;i<c.length;i++)
      {
         rev=c[i]+rev;
      }
      return rev;
   }
}
