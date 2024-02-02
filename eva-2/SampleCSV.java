import java.util.*;
import java.io.*;
public class SampleCSV
{
    public static void main(String args[])throws IOException
    {
       FileReader f=new FileReader("Sample.csv");
       Map<String ,ArrayList<String>> map=new HashMap<>();
       BufferedReader reader=new BufferedReader(f);
       String line=reader.readLine();
       String col[]=line.split(",");
       for(int i=0;i<col.length;i++)
       {
          map.put(col[i],new ArrayList());
       }
       while((line=reader.readLine())!=null)
       {
          String[] data=line.split(",");
          
          for(int i=0;i<data.length;i++)
          {
             ArrayList<String> al=map.get(col[i]);
             al.add(data[i]);
          }
       }
       for(Map.Entry entry :map.entrySet())
       {
             if(entry.getKey().equals("LastName"))
             {
                 System.out.println(entry.getValue());
             }
       }
    }
}
       
              
