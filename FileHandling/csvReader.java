//read csv file
import java.util.*;
import java.io.*;
public class csvReader
{
   public static void main(String args[])throws IOException
   {
       
       File file=new File("Sample.csv");
       Scanner scs=new Scanner(file);
       String line;
       while(scs.hasNextLine())
       {
            System.out.println(scs.nextLine());
       }
    }
}
            
