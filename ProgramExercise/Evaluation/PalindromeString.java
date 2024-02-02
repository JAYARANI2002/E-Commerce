//Build a program that takes a string as input and checks if it is a palindrome.
import java.util.Scanner;
public class PalindromeString
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string");
     String s=sc.next();
     String rev="";
     int i;
     char[] c=s.toCharArray();
     for(i=0;i<c.length;i++)
     {
        rev=c[i]+rev;
     }
     System.out.println(rev);
     if(s.equals(rev))
     {
        System.out.println("The string is palindrome");
     }
     else
     {
        System.out.println("The string is not palindrome");
     }
   }
}
