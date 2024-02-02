/**
Create a class called "Vehicle" with properties such as "make", "model", and "year". Create a subclass called "Car" that inherits from the Vehicle class and adds properties such as "color" and "numDoors".
**/
class Vehicle
{
   String make;
   String model;
   int year;
   Vehicle(String make,String model,int year)
   {
        this.make=make;
        this.model=model;
        this.year=year;
   }
}
class Car extends Vehicle
{
  String color;
  int numDoors;
  Car(String make,String model,int year,String color,int numDoors)
  {
      super(make,model,year);
      this.make=make;
      this.model=model;
      this.year=year;
      this.color=color;
      this.numDoors=numDoors;
  }
  public String toString()
  {
      return this.make+" "+this.model+" "+this.year+" "+this.color+" "+this.numDoors;
  }
}
public class VehicleClass
{
   public static void main(String args[])
   {
     Car car=new Car("TATA","SUV",2020,"Blue",4);
     System.out.println(car);
   }
}
 
