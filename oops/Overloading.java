public class Overloading
{
   public static void main(String args[])
   {
       int a=10,b=10;
       add(a,b);
       float a=1,b=2,c=4;
       add(a,b,c);
   }
   public int add(int a,int b)
   {
      System.out.println(a+b);
   }
   public float add(float a,float b,float c)
   {
      System.out.println(a+b+c);
   }
}
