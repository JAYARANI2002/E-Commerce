//Create a class called "Rectangle" with properties such as "length" and "width". Implement methods such as "getArea" and "getPerimeter" that calculate and return the area and perimeter of the rectangle.
public class RectangleClass
{
   public static void main(String args[])
   {
       Rectangle rect=new Rectangle(12.0f,5);
       System.out.println(rect.area());
       System.out.println(rect.perimeter());
       rect.setWidth(10);
       System.out.println(rect.area());
       System.out.println(rect.perimeter());
   }
}
class Rectangle
{
   private float length;
   private float width;
   Rectangle(float l,float b)
   {
      length=l;
      width=b;
   }
   public void setLength(float length)
   {
       this.length=length;
   }
   public void setWidth(float width)
   {
       this.width=width;
   }
   public float getLength()
   {
      return length;
   }
   public float getWidth()
   {
      return width;
   }
   public double area()
   {
     return getLength()*getWidth();
   }
   public double perimeter()
   {
      return 2*(getLength()+getWidth());
   }
}
