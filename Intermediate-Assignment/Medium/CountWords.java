//Write a program that reads a text file and counts the number of occurrences of each word in the file. The program should display the results in alphabetical order.
import java.util.*;
import java.io.*;
public class CountWords
{
  public static void main(String args[]) throws IOException
  {
   
   Map<String,Integer> map=new TreeMap<>();
   FileReader f=new FileReader("Dog.txt");
   BufferedReader reader=new BufferedReader(f);
   String line;
   while((line=reader.readLine())!=null)
   {
       String words[]=line.split("\\s");
       for(String word:words)
       {
	       if(map.containsKey(word))
	       {
		  map.put(word,map.get(word)+1);
	       }
	       else
	       {
		  map.put(word,1);
	       }
      }
   }
   reader.close();
   for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

  }
 
}
       
       
