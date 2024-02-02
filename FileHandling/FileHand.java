import java.io.*;
public class FileHand
{
   public static void main(String args[])
   {
       File f=new File("/home/zoho/jrani");
       //f.write();
       File list[]=f.listFiles();
       for(File s:list)
       {
           System.out.println(s.length());
       }
       //f.close();
   }
 }
 
