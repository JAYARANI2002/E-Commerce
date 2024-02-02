//create a model/class Car and add data by creating objects
class Car
{
   String name;
   String model;
   double price;
   String fuel;
   int number;
   Car(String name,String model,double price,String fuel,int number)
   {
        this.name=name;
        this.model=model;
        this.price=price;
        this.fuel=fuel;
        this.number=number;
   }
   public String display()
   {
        return this.name+" "+this.model+" "+this.price+" "+this.fuel+" "+this.number;
   }
}
public class CarClass
{
    public static void main(String args[])
    {
           Car car1=new Car("BMW","XX02",540000.30,"petrol",1965);
           Car car2=new Car("Mushtank","2-B01",920000.30,"Diesel",1518);
           Car car3=new Car("Mahindra","Q001",640000.0,"Electricity",9700);
           Car car4=new Car("Benz","N032",440000.00,"petrol",2001);
           Car car5=new Car("Hyundai","J-Q02",400000,"Diesel",1909);
           System.out.println(car1.display());
           System.out.println(car2.display());
           System.out.println(car3.display());
           System.out.println(car4.display());
           System.out.println(car5.display());
    }
}
