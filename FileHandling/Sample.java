import java.io.File;
import java.util.IOException;
import java.util.Scanner;
public class FileCreate
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the file name to create");
	   String filename=sc.next();
	   try
	   {
               File f=new File(filename);
	       if(f.createNewFile())
	       {
	            System.out.println("File is successfully created");
	       }
	       else
	       {
	           System.out.println("File already exists");
	       }
            
	   }
           catch(IOException e)
           {
                System.out.println("Error in file creating....");
                e.printStackTrace();
           }
 
	}

}
