import java.io.*;
public class Demo1
{
   public static void main(String[] args) throws IOException
   {
     try
     {
      FileOutputStream f=new FileOutputStream("File2.txt");
      ObjectOutputStream o=new ObjectOutputStream(f);
      S s=new S("xxxx",20,"BE","RIT" );
      o.writeObject(s);
      o.flush();
     }
     catch(IOException e)
     {
        e.printStackTrace();
     }
     System.out.println("Successfully writed.........");
     try
     {
       ObjectInputStream i=new ObjectInputStream(new FileInputStream("File2.txt"));
       
       S n=(S)i.readObject();
       System.out.println(n.name1+" "+n.age1+" "+n.course+" "+n.clg);
     }
     catch(Exception e)
     {
     
     }
     System.out.println("Successfully readed.........");
   }
}
class P implements Serializable
{
   String name1;
   int age1;
   P(String name,int age)
   {
       name1=name;
       age1=age;
   }
}
class S extends P 
{
   String course;
   String clg;
   S(String name,int age,String course,String clg)
   {
      super(name,age);
      this.course=course;
      this.clg=clg;
   }
}
      
