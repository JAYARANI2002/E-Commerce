import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class FileProgram
{
     public static void main(String args[])throws IOException
     {
           FileInputStream fr=new FileInputStream("Example.txt");
           BufferedInputStream br=new BufferedInputStream(fr);
           System.out.println(br.available());
           br.skip(20);
           Sytstem.out.println(br);
     }
}

