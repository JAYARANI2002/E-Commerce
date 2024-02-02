//Write a Java program that demonstrates the use of inheritance by creating a parent class and a child class that inherits from it. Instantiate objects of both classes and invoke their methods
public class ProgramMain
{
  public static void main(String args[])
  {
     Parent p=new Parent();
     p.runParentMethod();
     Child c=new Child();
     c.runChildMethod();
  }
}
class Parent
{
  public void runParentMethod()
  {
    System.out.println("Run the Parent class method");
  } 
  
}
class Child extends Parent
{
  public void runChildMethod()
  {
    System.out.println("Run the Child class method");
  } 
}
