import java.io.*;
public class StreamExample
{
   public static void main(String args[])throws IOException
   {
       FileReader reader=new FileReader(new File("FileWrite.class"));
       System.out.println(reader.markSupported());
       int data;
       while((data=reader.read())!=-1)
       {
          System.out.print((char)data);
       }
       String content="Thank you";
     //  FileWriter writer=new FileWriter(new File("FileWrite.class"));
       //writer.write(content);
   }
}
