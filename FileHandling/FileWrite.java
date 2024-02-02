//Write a Java program to read a text file and count the number of occurrences of a given word.


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWrite
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
	            FileWriter writer=new FileWriter(f);
	            writer.write("This file is open just now to write the information about file writing .This file is open just now to write the information about file writing .");
	            //System.out.println(f);
	            writer.close();
	            System.out.println("word to count the occurance");
	            String word=sc.next();
	            int count=0;
	            System.out.println("---------------------");
	            System.out.println("content");
	            Scanner reader=new Scanner(f);
	            while(reader.hasNextLine())
	            {
                        String data=reader.next();
                        if(data.equals(word))
                        {
                             count++;
                        }
                        //System.out.print(data+" ");
                    }
                    System.out.println("---------------------");
                    System.out.println(count);
                    reader.close();
	       }
	       else
	       {
	           System.out.println("File already exists");
	           f.delete();
	       }
	       
          
	   }
           catch(IOException e)
           {
                System.out.println("Error in file creating....");
                e.printStackTrace();
           }
 
	}

}
