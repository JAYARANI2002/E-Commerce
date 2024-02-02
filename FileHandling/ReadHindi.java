import java.util.*;
import java.io.*;
public class ReadHindi
{
   public static void main(String args[])throws Exception
   {
      FileInputStream file=new FileInputStream("hindi.txt");
      BufferedReader reader=new BufferedReader(new InputStreamReader(file));
      BufferedWriter writer=new BufferedWriter(new FileWriter("out.txt"));
      int c=0;
      while((c=reader.read())!=-1)
      {
         System.out.println((char)c);
         writer.write((char)c);
      }     
      file.close();
      reader.close();
      writer.close();
   }
}
