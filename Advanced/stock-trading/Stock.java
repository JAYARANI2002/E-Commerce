//package com.mypack.stock;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
import java.sql.SQLException;
public class Stock
{
   String name;
   double price;
   static Scanner sc=new Scanner(System.in);
   Stock(String name,double price)
   {
       this.name=name;
       this.price=price;
   }
   Stock(){
   }
   public String getName()
   {
       return name;
   }
   public double getPrice()
   {
       return price;
   }
   public static void addStock()
   {
     try
     {
       System.out.println("Enter the stock name");
       String name=sc.next();
       System.out.println("Enter the stock price");
       double price=sc.nextDouble();
       Stock stock=new Stock(name,price);
       Management.addStock(stock);
     }
     catch(InputMismatchException e)
     {
        System.out.println(e);
     }
   }
   public static double getCurrentPrice(double price)
   {
      Random random=new Random();
      int percent=random.nextInt(10+10)-1;
      double currentPrice=price+percent*price/100;
      return currentPrice;
   }
   public static void stockPurchase(int portfolio_id)throws SQLException
   {
     l1:while(true)
      {
          System.out.println("1. buy stock");
          System.out.println("2. sell stock");
          System.out.println("3. update account");
          System.out.println("4. Exit");
          System.out.println("Enter the choice");
          switch(sc.nextInt())
          {
              case 1:
              {
                 buyStock(portfolio_id);
                 break;
              }
              case 2:
              {
                 sellStock(portfolio_id);
                 break;
                 
              }
              case 3:
              {
                 updateStatus(portfolio_id);
                 break;
              }
              case 4:
              {
                 break l1;
              }
           }
       }
  }
  public static void buyStock(int portfolio_id)throws SQLException
  {
    try
    {
       if(Management.selectStock(portfolio_id))
       {
          int stock_id;
          System.out.println("Enter the stock id");
          stock_id=sc.nextInt();
          Management.buyStock(stock_id,portfolio_id);
       }
       else
       {
         System.out.println("You don't have enough amount to buy a stock");
       }
     }
     catch(SQLException e)
     {
        System.out.println(e);
     }
  }
  public static void sellStock(int portfolio_id)throws SQLException
  {
    try
    {
       if(Management.selectBuyStock(portfolio_id))
       {
          int stock_id;
          System.out.println("Enter the stock id");
          stock_id=sc.nextInt();
          Management.sellStock(portfolio_id,stock_id);
       }
       else
       {
            System.out.println("You don't have enough amount to buy a stock");
       }
     }
     catch(SQLException e)
     {
        System.out.println(e);
     }
  }
  public static void updateStatus(int portfolio_id)throws SQLException
  {
      l1:while(true)
      {
          System.out.println("1. Display current Balance");
          System.out.println("2. Add investment amount");
          System.out.println("3. Exit");
          System.out.println("Enter the choice");
          switch(sc.nextInt())
          {
             case 1:
             {
                 double Amount=Management.getUserAmount(portfolio_id);
                 System.out.println("Current Balance: "+Amount);
                 break;
             }
             case 2:
             {
                 System.out.println("Enter the amount");
                 double invest=sc.nextDouble();
                 Management.updatePortfolio(portfolio_id,invest);
                 break;
             }
             case 3:
             {
                break l1;
             }
         }
     }
  }
}
