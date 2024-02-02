//Example that reads the data from two files and writes into another file
import java.io.File;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.io.IOException;
import java.util.Scanner;
public class CopyFile
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       try
       {
         FileInputStream file1=new FileInputStream("File1.txt");
         FileInputStream file2=new FileInputStream("File2.txt");
         //File f=new File("File1.txt");
         SequenceInputStream s=new SequenceInputStream(file1,file2);
         int i;
         while((i=s.read())!=-1)
         {
             System.out.print(i+" ");
         }
         file1.close();
         file2.close();
         s.close();
       }
       catch(IOException e)
       {
           System.out.println("Exception occured");
           e.printStackTrace();
       }
       
    }
}
         
