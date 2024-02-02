/*Write Class MyString Write a method
i) concat(String str)return type String- Concatenates the specified string to the end of this string.
ii) charAt(int index) Returns the char value at the specified index.
iii) endsWith(String suffix) return type boolean-Tests if this string ends with the specified suffix.
iv) static String copyValueOf(char[] data) -Returns a String that represents the character sequence in the array specified.
v) int indexOf(String str)- Returns the index within this string of the first occurrence of the specified substring.
vi) boolean startsWith(String prefix)-Tests if this string starts with the specified prefix.
vii) String substring(int beginIndex)- Returns a new string that is a substring of this string.*/
package mystring;
import java.util.Scanner;
class Program
{
  String s1;
  Program(String s)
  {
     s1=s;
  }	
  String concat(String s2)
  {
    String concatString=s1+s2;
    return concatString;
  }
  char charAt(int index)
  {
     int len=s1.length();
     char[] charArr=s1.toCharArray();
     if ((index < 0) || (index >= len)) {    
           throw new StringIndexOutOfBoundsException(index);    
     }    
     return charArr[index];    
  }
  boolean endsWith(String end)
  {
     int l=s1.length()-end.length();
     System.out.println(l);
     boolean flag=false;
     char[] endArray=end.toCharArray();
     char[] charArr=s1.toCharArray();
     int j=0;
     while(l<s1.length())
     {
        if(endArray[j]==charArr[l])
        {
           flag=true;
        }
        l++;
        j++;
     }
     return flag;
   }
  boolean startsWith(String start)
  {
     int l=start.length();
     boolean flag=false;
     char[] startArray=start.toCharArray();
     char[] charArr=s1.toCharArray();
     int i;
     for(i=0;i<start.length();i++)
     {
        if(startArray[i]==charArr[i])
        {
           flag=true;
        }
        
     }
     return false;
   }
   String copyValueOf(char[] c)
   {
         int i;
         String result="";
         int n=c.length;
         for(i=0;i<n;i++)
         {
                result+=c[i]; 
         }
         return result;
   }   
   int indexOf(String s)
   {
     int l=s.length();
     char[] sArray=s.toCharArray();
     char[] charArr=s1.toCharArray();
     int i,j=0;
     for(i=0;i<charArr.length;i++)
     {
        if(charArr[i]==sArray[j])
        {
            return i;
        }
        j++;
     }
     return 0;
   }   
   String substring(int i)
   {
      String subString="";
      char[] charArr=s1.toCharArray();
      while(i<s1.length())
      {
          subString+=charArr[i];
          i++;
      }         
      return subString;
   }
}
public class MyString
{
     public static void main(String args[])
     {
       System.out.print("s1:");
       Scanner sc=new Scanner(System.in);
       String s1=sc.next();
       Program s=new Program(s1);
       System.out.print("s2:");
       String s2=sc.next();
       System.out.println("i) concat(String str)return type String- Concatenates the specified string to the end of this string.\n");
       System.out.println(s.concat(s2));
       System.out.println("Enter the index i value");
       int index=sc.nextInt();
       System.out.println("ii) charAt(int index) Returns the char value at the specified index  \n");
       System.out.println(s.charAt(index)+"\n");
       System.out.println("iii) endsWith(String suffix) return type boolean-Tests if this string ends with the specified suffix.\n");
       System.out.println("Enter the string to check the endswith ");
       String end=sc.next();
       System.out.println(s.endsWith(end)+"\n");
       System.out.println("iv) static String copyValueOf(char[] data) -Returns a String that represents the character sequence in the array specified.\n");
       System.out.println("Enter the Character array length");
       int n=sc.nextInt();
       System.out.println("Enter the Character array chars");
       char carray[]=new char[n];
       int j;
       for(j=0;j<n;j++)
       {
          carray[j]=sc.next().charAt(0);
       }
       System.out.println(s.copyValueOf(carray)+"\n");
       System.out.println("v) int indexOf(String str)- Returns the index within this string of the first occurrence of the specified substring.\n");
       System.out.println("Enter the string to find index:");
       String search=sc.next();
       System.out.println(s.indexOf(search));
       System.out.println("vi) boolean startsWith(String prefix)-Tests if this string starts with the specified prefix.");
       System.out.println("Enter the string to check the startswith ");
       String start=sc.next();
       System.out.println(s.startsWith(start));
       System.out.println("vii) String substring(int beginIndex)- Returns a new string that is a substring of this string.\n");
       int beginIndex=sc.nextInt();
       System.out.println(s.substring(beginIndex));
     }       
  }  
































