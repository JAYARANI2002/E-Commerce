 /*
      6. Write a program to remove all occurrences of a given character from input String.

            Input : ABCabc, a Output: BCbc

            Input : ABCabc, d Output: ABCabc
 */
 import java.util.Scanner;
 public class RemoveOccuranceCharacter
 {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string");
       String s=sc.next();
       String modifyString="";
       char c=sc.next().charAt(0);
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)+32 ==c ||  s.charAt(i) ==c)
           {
              continue;
           }
           else
           {
              modifyString+=s.charAt(i);
           }
       }
       System.out.println(modifyString);
    }
 }          
