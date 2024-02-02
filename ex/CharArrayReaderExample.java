import java.io.*;
public class CharArrayReaderExample
{
  public static void main(String args[]) throws IOException
  {
    char[] c={'j','a','y','a'};
    String name;
    CharArrayReader cr=new CharArrayReader(c);
    CharArrayWriter cw=new CharArrayWriter();
    int e=0;
    while((e=cr.read())!=-1)
    {
        System.out.println(e);
    }
    for(int i=0;i<256;i++)
    {
      cw.write(i);
    }
    String re=cw.toString();
   }
  }
