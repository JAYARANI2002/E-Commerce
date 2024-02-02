class A
{
   A(int a){
   System.out.println("A constructor" + a);
}
}
   class B extends A
   {
   
      B(){
       super(5);
   }
   }
   
public class Opps{
   public static void main(String args[])
   {
      //B obj=new B();
   }   
}
