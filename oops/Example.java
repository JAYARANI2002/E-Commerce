import java.util.Scanner;
import java.lang.reflect.Constructor;
class Student
{
   String name;
   int mark1;
   int mark2;
   int mark3;
   int mark4;
   int mark5;
   int mark6;
   int sum1;
   int sum2;
   public Student(String n,int m1,int m2,int m3,int m4,int m5)
   {
       name=n;
       mark1=m1;
       mark2=m2;
       mark3=m3;
       mark4=m4;
       mark5=m5;
       this.sum1=Sum(mark1,mark2,mark3,mark4,mark5);
   }
   public Student(String n,int m1,int m2,int m3,int m4,int m5,int m6)
   {
       name=n;
       mark1=m1;
       mark2=m2;
       mark3=m3;
       mark4=m4;
       mark5=m5;
       mark6=m6;
       this.sum2=Sum(mark1,mark2,mark3,mark4,mark5,mark6);
   }
   
   public int Sum(int mark1,int mark2,int mark3,int mark4,int mark5)
  {
     int sum=mark1+mark2+mark3+mark4+mark5;
     return sum;
  }
   public int Sum(int mark1,int mark2,int mark3,int mark4,int mark5,int mark6)
  {
     int sum=mark1+mark2+mark3+mark4+mark5+mark6;
     return sum;
  }
  
 
 }
  public class Example
  {
  public static void main(String args[])
  {
     Class a=Example.class;
     Constructor[] c=a.getConstructors();
     Student stu1=new Student("Jai",90,95,93,100,97);
     Student stu2=new Student("Rani",95,98,99,97,99);
     Student stu3=new Student("Mani",98,97,99,100,98);
     
     Student s1=new Student("Jai",90,95,93,100,97,87);
     Student s2=new Student("Rani",95,98,99,97,99,90);
     Student s3=new Student("Mani",98,97,99,100,98,92);
     System.out.println(stu1.name+"'s Sum of Total marks is   "+stu1.sum1);
     System.out.println(stu2.name+"'s Sum of Total marks is   "+stu2.sum1);
     System.out.println(stu3.name+"'s Sum of Total marks is   "+stu3.sum1);
     System.out.println(s1.name+"'s Sum of Total marks is   "+s1.sum2);
     System.out.println(s2.name+"'s Sum of Total marks is   "+s2.sum2);
     System.out.println(s3.name+"'s Sum of Total marks is   "+s3.sum2);
     for(Constructor i:c)
     {
         System.out.println(i.getName());
     }   
  }
 }
  
