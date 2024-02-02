import java.io.File;
import java.util.Scanner;
public class CSVExample
{
  public static void main(String args[])throws Exception
  {
     Scanner sc=new Scanner(new File("Sample.csv"));
     sc.useDelimiter(" ");
     while(sc.hasNextLine())
     {
        System.out.print(sc.next());
     }
     sc.close();
  }
}
