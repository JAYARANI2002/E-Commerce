/*
Create a class called "Shape" with a method called "draw" that prints out "Drawing a shape". Create subclasses such as "Rectangle" and "Circle" that override the draw method to print out "Drawing a rectangle" and "Drawing a circle" respectively.
*/
class Shape
{
   public void draw()
   {
        System.out.println("Drawing a shape");
   }
}
class Rectangle extends Shape
{
    public void draw()
   {
        System.out.println("Drawing a rectangle");
   }
}
class Circle extends Shape
{
    public void draw()
   {
        System.out.println("Drawing a circle");
   }
}
public class Example
{
   public static void main(String[] args)
   {
      Shape s=new Shape();
      s.draw();
      s=new Rectangle();
      s.draw();
      s=new Circle();
      s.draw();
   }
}
