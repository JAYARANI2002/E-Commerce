//Write a Java program that reads a file using BufferedReader and stores the data into an ArrayList. Use Iterator to traverse the list and display the content.

import java.util.*;
import java.io.*;
public class ReadAndDisplay
{
   public static void main(String args[])throws IOException
   {
      BufferedReader reader=new BufferedReader(new FileReader("Dog.txt"));
      String line;
      ArrayList<String> list=new ArrayList<>();
      while((line=reader.readLine())!=null)
      {
          list.add(line);
      }
      Iterator<String> i=list.iterator();
      while(i.hasNext())
      {
          System.out.print(i.next());
      }
   }
}

      
          
