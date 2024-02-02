import java.io.FileInputStream;
import java.io.FileOutputStream;
public class SreamWrite
{
    public static void main(String args[])
    {
    FileInputStream in=null;
    try
    {
       in=new FileInputStream("input.txt");
       FileOutputStream out=new FileOutputStream("output.txt");
       int bydata;
       while((bydata=in.read())!=-1)
       {
          out.write((char)bydata);
       }
    }
    catch(Exception e)
    {
       e.printStackTrace();
    }
    finally
    {
        System.out.println("completed");
    }
  }
}

       
