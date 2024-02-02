//Implement an abstract class in Java with at least one abstract method. Create a concrete class that extends the abstract class and implement the abstract method. Instantiate the concrete class and invoke its method.

abstract class Program
{
   abstract void display(String name);
   static void runProgram()
   {
       System.out.println("The abstract class static method is running");
   }
}
class ChildProgram extends Program
{
    void display(String name)
    {
          System.out.println("Welcome "+name);
    }
}
public class ExampleProgram
{
   public static void main(String args[])
   {
     Program child=new ChildProgram();
     child.display("V");
   }
}
   
