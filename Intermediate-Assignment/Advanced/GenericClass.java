//Implement a generic class in Java that stores a collection of elements of any type. Use the class to store strings, integers, and custom objects. Demonstrate the use of wildcard and bounded type parameters.
import java.util.*;
public class GenericClass
{
   public static void main(String args[])
   {
       String s="hai";
       Generic<String> gen=new Generic<String>();
       gen.add(s);
       //System.out.println(gen);
       Generic<Number> upperbound=new Generic<Number>();
       upperbound.add(1);
       upperbound.add(2.0d);
       upperbound.add(0.980807f);
       System.out.println(upperbound);
       //Generic<?extends A> n=new Generic<Object>();// error
       Generic<? super A> p=new Generic<Object>();
       Generic<?extends A> n=new Generic<B>();
      // n.add(1);
   }
}
class Generic<E>
{
   List<E> collection;
   public Generic()
   {
       this.collection=new ArrayList<>();
   }
   public void add(E element)
   {
       collection.add(element);
   }
   
   
}
class A
{
}
class B extends A
{
}  
