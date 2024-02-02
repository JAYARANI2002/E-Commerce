//package com.mypack.stock;
import java.util.Scanner;
public class StockTrading
{
   static Scanner sc=new Scanner(System.in);
   public static void main(String args[])
   {
       Management.createAccountTable();
       Management.createStockTable();
       Management.updateStockPrice();
       Management.createPortfolioTable();
       Management.createPurchaseStockTable();
       l1:while(true)
       {
           System.out.println("1. Signin");
           System.out.println("2. Signup");
           System.out.println("3. Add stock");
           System.out.println("4. Exit");
           System.out.println("select the option");
           switch(sc.nextInt())
           {
               case 1:
               {
                   new Account().signin();
                   break;
               }
               case 2:
               {
                   new Account().signup();
                   break;
               }
               case 3:
               {
                  Stock.addStock();
                  break;
               }
               case 4:
               {
                  Management.close();
                  System.exit(0);
               }
           }
       }
   }
}
