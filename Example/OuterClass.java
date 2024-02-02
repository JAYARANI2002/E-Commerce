public class OuterClass
{
  private int a=10;
  void msg()
  {
    System.out.println("hai I am outer");
    class LocalInnerClass
    {
      void run(){
       System.out.println("Local inner class");
    }
    }
  LocalInnerClass l=new LocalInnerClass();
  l.run();
  }
  interface readable
  {
  }
  protected class InnerClass
  {
      void msg2()
      {
         System.out.println("hai I am inner");
         System.out.println(a);
       }
   }
   public static void main(String args[])
   {
      OuterClass o=new OuterClass()
      {
          void print(){System.out.println("Anonyumns class");};};
      OuterClass.InnerClass i=o.new InnerClass();
      OuterClass.InnerClass i1=o.new InnerClass();
      OuterClass.InnerClass i2=o.new InnerClass();
      OuterClass.InnerClass i3=o.new InnerClass();
      OuterClass.InnerClass i4=o.new InnerClass();
      i.msg2();
      o.msg();
    }
 }
interface readable1
 {
   public interface re2
    {}
 }
 class Outer$Inner
 {
   
   
 }
