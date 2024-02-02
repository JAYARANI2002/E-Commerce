private class C {
int n=500;
}
   class B extends C
   {
     int n=100;
   }

public class A
{
   public static void main(String[]args)
   {
      B obj=new B();
      System.out.println(obj.n);
   }   
}

