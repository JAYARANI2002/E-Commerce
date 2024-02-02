import java.util.Scanner;
public class Stock
{
   String name;
   double price;
   Stock(String name,double price)
   {
       this.name=name;
       this.price=price;
   }
   Stock(){
   }
   public static void addStock()
   {
       System.out.println("Enter the stock name");
       String name=sc.next();
       System.out.println("Enter the stock price");
       double price=sc.nextDouble();
       Stock stock=new Stock(name,price);
       Management.addStock(stock);
   }
}
