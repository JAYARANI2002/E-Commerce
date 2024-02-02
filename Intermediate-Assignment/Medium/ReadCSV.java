//Write a program that reads a CSV file line by line and and stores the data into a HashMap with column name as a key and entries as value. 
import java.io.*;

import java.util.*;
public class ReadCSV
{
   public static void main(String args[])throws IOException
   {
      FileReader f=new FileReader("Sample.csv");
      BufferedReader reader=new BufferedReader(f);
      Map<String,ArrayList<String>> map=new HashMap<>();
      String line=reader.readLine();
      String column[]=line.split(",");
      for(int i=0;i<column.length;i++)
      {
         map.put(column[i],new ArrayList());
      }
      while((line=reader.readLine())!=null)
      {
         String row[]=line.split(",");
         for(int i=0;i<row.length;i++)
         { 
               ArrayList<String> list=map.get(column[i]);
               list.add(row[i]);
         }
       
      }
   reader.close();
   for (Map.Entry entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

   }
}
         
