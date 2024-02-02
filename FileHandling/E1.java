import java.io.*;
public class E1
{
  public static void main(String args[])
  {
  try{
     BufferedReader bf=new BufferedReader(new FileReader("Sample.csv"));
     String l;
     while((l=bf.readLine())!=null)
     {
        String[] v=l.split(",");
        for(String s:v)
        {
          System.out.printf("%-10s",s);
        }
        System.out.println();
     }
  }
  catch(Exception e)
  {
      e.printStackTrace();
  }
  }
}
