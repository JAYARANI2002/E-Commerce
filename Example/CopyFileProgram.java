/*Write a Java program to read a text file and count the number of occurrences of a given word.
Write a Java program to copy a file from one directory to another directory.
Write a Java program to read a CSV file and display its contents in a table format.
Write a Java program to read a binary file and display its contents in hexadecimal format.
Write a Java program to create a new directory and copy all the files from an existing directory to the new directory.
*/
import java.util.Properties;
import java.io.*;
public class CopyFileProgram
{
  public static void main(String args[]) throws IOException
  {File f=new File("Work");
     f.createNewFile();
     f.mkdir();/*
     System.out.println(f.getAbsolutePath());
     FileWriter writer=new FileWriter(f);
     writer.write("Hello i am a java file");
     writer.close();
     System.out.println(System.getProperty("dir"));
     FileInputStream fis=new FileInputStream(f);
     int a;
     while((a=fis.read())!=-1)
     {
        //a=a.getBytes();
        System.out.print(Long.toHexString(a)+" ");
     }*/
   /*  FileInputStream opendir=new FileInputStream("/jrani/Example/File1.java");
     FileOutputStream writedir=new FileOutputStream(f);
     int i;
     while((i=opendir.read())!=-1)
     {
          writedir.write((char)i);
     }
   }
   catch(Exception e)
   {
      e.printStackTrace();
   }*/
   System.out.println(System.getProperty("java.runtime.version"));
   Properties p=System.getProperties();
   p.list(System.out);
  }
}
