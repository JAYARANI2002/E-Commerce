//Write a Java program to copy a file from one directory to another directory.
import java.io.*;
public class CopyFile1
{
   public static void main(String args[])
   {
     try
     {
       FileInputStream input=new FileInputStream("File1.txt");
       FileOutputStream output=new FileOutputStream("File2.txt");
       char[] v=new char[1024];
       int t;
       while((t=input.read())!=-1)
       {
           output.write((char)t);
       }
       output.close();
     }
     catch(IOException e)
     {
     
     }
   }
 }
       
          
