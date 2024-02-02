//Create a class called "Shape" with properties such as "numSides" and "area". Create a subclass called "Rectangle" that inherits from the Shape class and adds properties such as "length" and "width".

class Shape
{
   int numSides;
   double area;
   Shape(int numSides,double area)
   {
       this.numSides=numSides;
       this.area=area;
   }
}
class Rectangle extends Shape
{
    float length;
    float width;
    Rectangle(int numSides,float length,float width)
    {
        super(numSides,length*width);
        this.numSides=numSides;
        this.area=area;
        this.length=length;
        this.width=width;
    }
    public String toString()
    {
        return "Rectangle length is "+this.length+" and width is "+this.width+" \n Area = "+this.area;
    } 
}
public class ShapeClass
{
   public static void main(String args[])
   {
       Rectangle rect=new Rectangle(4,12f,6.9f);
       System.out.println(rect);
   }
}


    
