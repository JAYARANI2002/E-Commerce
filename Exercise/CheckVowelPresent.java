/*
      1. Write a program to check if a vowel is present in the string.
            Input: aAnt Output: true 

            Input: Brklmn Output: false
*/
import java.util.Scanner;
public class CheckVowelPresent
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string");
       String s=sc.next();
       boolean flag=false;
       for(int i=0;i<s.length();i++)
       {
         if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
         {
               flag=true;
               break;
         }
         else
         {
               flag=false;
               break;
         }
       }
       System.out.println(flag);
   }
}
