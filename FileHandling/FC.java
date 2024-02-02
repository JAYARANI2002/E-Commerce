import java.io.*;
public class FC
{
  public static void main(String args[])
  {
     File file=new File("pro");
     if(file.mkdir())
     {
        System.out.print("Directory successfully created" +file.getChannel());
     }
     else
     {
     
        System.out.print("Directory is not created");
     }
   }
}
