import java.util.Scanner;
public class Student
{
   String name;
   int mark1;
   int mark2;
   int mark3;
   int mark4;
   int mark5;
   Student(String name,int mark1,int mark2,int mark3,int mark4,int mark5)
   {
       this.name=name;
       this.mark1=mark1;
       this.mark2=mark2;
       this.mark3=mark3;
       this.mark4=mark4;
       this.mark5=mark5;
  }
  public static int  Sum(int mark1,int mark2,int mark3,int mark4,int mark5)
  {
     int sum=mark1+mark2+mark3+mark4+mark5;
     return sum;
  }
}
  public class Example
  {
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     int mark1=sc.nextInt();
     int mark2=sc.nextInt();
     int mark3=sc.nextInt();
     int mark4=sc.nextInt();
     int mark5=sc.nextInt();
     Student obj=new Student();
     System.out.println(obj.sum());
  }
 }
  
