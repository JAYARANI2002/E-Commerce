//Create a method called "isPalindrome" that takes a string as an argument and returns true if the string is a palindrome (reads the same backward as forward) and false otherwise.
import java.util.Scanner;
public class Palindrome
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s=sc.next();
      System.out.println("Check the string is palindrome "+isPalindrome(s));
   }
   public static boolean isPalindrome(String string)
   {
      int i=0;
      int j=string.length()-1;
      boolean flag=false;
      while(i<j)
      {
         if(string.charAt(i)==string.charAt(j))
         {
            flag=true;
            i++;
            j--;
         }
         else
         {
            return false;
         }
      }
      return flag;
   }
 }
         
         
