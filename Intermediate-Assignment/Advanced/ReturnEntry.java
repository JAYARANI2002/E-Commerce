//Create a Java program that reads a CSV file using FileReader and stores the data into a HashSet. Implement a method that takes a string as input and searches the HashSet for matching entries. Display the results.

import java.util.*;
import java.io.*;
public class ReturnEntry
{
  public static void main(String args[])throws IOException
  {
     FileReader f=new FileReader("Sample.csv");
     BufferedReader reader=new BufferedReader(f);
     HashMap<String,ArrayList<String>> map=new HashMap<>();
     String line=reader.readLine();
     String column[]=line.split(",");
     for(int i=0;i<column.length;i++)
     {
        map.put(column[i],new ArrayList());
     }
     while((line=reader.readLine())!=null)
     {
        String entries[]=line.split(",");
        for(int i=0;i<entries.length;i++)
        {
             ArrayList<String> values=map.get(column[i]);
             values.add(entries[i]);
        }
     }
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the key to return their entries");
     String key=sc.next();
     for(Map.Entry entry:map.entrySet())
     {
         if(entry.getKey().equals(key))
         {
             System.out.println(entry.getValue());
         }

      }
    }
}
