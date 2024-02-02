import java.io.*;
import java.util.zip.*;
import java.util.Scanner;
public class Sample1
{
	public static void main(String args[])
	{
	   
	  try
	  {
	   FileInputStream f=new FileInputStream("File1.txt");
	   FileOutputStream fo=new FileOutputStream("File2.txt");
	   DeflaterOutputStream o=new DeflaterOutputStream(fo);
	   while(f.read()!=-1)
	   {
              o.write(f.read());
           }
          }
          catch (IOException e)
          {
                e.printStackTrace();
          }
           
 
	}

}
