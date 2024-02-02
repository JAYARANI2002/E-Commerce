interface Product
{
    void feedback();
    void working();
}
abstract class Mobile implements Product
{
   String name;
   int price;
   String model;
   int warranty;
   Mobile(String name,int price,String model,int warranty)
   {
       name=n;
       price=p;
       model=mo
   void feedback()
   {
        String quality="Good";
   }
   void working()
   {
      String speed="high";
   }
   void display()
   {
      System.out.println(name+" "+price+" "+quality+" "+speed);
   }
public class InterfaceExample
{
  public static void main(String args[])
  {
    Mobile mobile =new Mobile();
    mobile.feedback();
    mobile.working();
  }
}
