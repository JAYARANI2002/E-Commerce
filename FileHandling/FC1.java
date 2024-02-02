import java.io.*;
import java.nio.channels.FileChannel;
public class FC1
{
  public static void main(String args[])
  {
     FileChannel file=new FileInputStream("File1.txt").getChannel();
     System.out.println("Get Channel"+file.size());     
   }
}
