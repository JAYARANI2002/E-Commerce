//Create a Java program that reads a CSV file using FileReader and stores the data into a HashSet. Implement a method that takes a string as input and searches the HashSet for matching entries. Display the results.
import java.util.*;
import java.io.*;
public class ReadFileStoreHashSet
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffer=new BufferedReader(new FileReader("Dog.txt"));
        HashSet<String> input=new HashSet<>();
        String data;
        while((data=buffer.readLine())!=null)
        {
           String word[]=data.split("//s");
           
           for(int i=0;i<word.length;i++)
           {
               input.add(word[i]);
           }
        }
        System.out.println(input);
    }
 }
