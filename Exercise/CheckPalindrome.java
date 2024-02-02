/*
      3. Write a program to find out if the given string (ignore the spaces in the string) is palindrome or not.

            Input: abBa              Output: true

            Input: a     b  cba      Output: true

            Input: ab                   Output: false
*/
import java.util.Scanner;
public class CheckPalindrome
{
  public static void main(String arhs[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the string");
   String s=sc.next();
   int i=0,j=s.length()-1;
   boolean flag=true;
   while(i<j)
   {
      if(s.charAt(i)>65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122 && s.charAt(i)==s.charAt(j) || s.charAt(i)+32==s.charAt(j) || s.charAt(i)-32==s.charAt(j) || s.charAt(i)==s.charAt(j)+32 || s.charAt(i)==s.charAt(j)-32)
      {
         flag=true;
      }
      else
      {
         flag=false;
      }
      i++;
      j--;
   }
   System.out.println(flag);
  }
}
      
