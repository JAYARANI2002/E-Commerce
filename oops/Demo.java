public class A
{
   System.out.println("Hai");
   A(){
   System.out.println("A constructor");
   }class B extends A
   {
     System.out.println("B class");
   }
   public static void main(String args[])
   {
      B obj=new B();
      System.out.println(obj);
   }   
}

