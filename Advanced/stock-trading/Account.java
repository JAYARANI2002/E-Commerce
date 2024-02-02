//package com.mypack.stock;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.InputMismatchException;
public class Account implements Accessable
{
    static Scanner sc=new Scanner(System.in);
    String name,username,password,phoneno;
    public Account(){};
    Account(String name,String username,String password,String phoneno)
    {
        this.name=name;
        this.username=username;
        this.password=password;
        this.phoneno=phoneno;
    }
    public String getName()
    {
        return name;
    }
    public String getUserName()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public String getPhone()
    {
        return phoneno;
    }
    public String toString()
    {
          return this.getName()+" "+this.getUserName()+" "+this.getPhone();
    }
    public void signin()
    {
      try
      {
        System.out.println("Enter the user name");
        String username=sc.next();
        System.out.println("Enter the password");
        String password=sc.next();
        int account_id=Management.validateAccount(username,password);
        if(account_id!=-1)
        {
            manageAccount(account_id);
        }
        else
        {
           System.out.println("please login account using correct credentials");
        }
      }
      catch(InputMismatchException e)
      {
          System.out.println("Enter the correct data format");
      }
    }
    public void  signup()
    {
      try
      {
       System.out.println("Enter the name");
       String name=sc.next();
       System.out.println("Enter the username");
       String username=sc.next();
       System.out.println("Enter the password");
       String password=sc.next();
       System.out.println("Enter the phone number");
       String phone=sc.next();
       Management.insertAccount(new Account(name,username,password,phone));
      }
      catch(InputMismatchException e)
      {
          System.out.println(e);
      }
    }
    public static void manageAccount(int account_id)
    {
     try
     {
       l1: while(true)
       {
            System.out.println("1.create portfolio");
            System.out.println("2.purchase");
            System.out.println("3.delete portfolio");
            System.out.println("4.purchase history");
            System.out.println("5.exit");
            System.out.println("Enter the choice");
            switch(sc.nextInt())
            {
                case 1:
                {
                    System.out.println("Enter the investment amount");
                    double amount=sc.nextDouble();
                    int portfolio_id=Management.createPortfolio(account_id,amount);
                    Management.displayStock();
                    break;
                }
                case 2:
                {
                   Stock.stockPurchase(Management.getPortfolioId(account_id));
                   break;
                }
                case 3:
                {
                    
                    break;
                }
                case 5:
                {
                    break l1;
                }
            }
       }
   }
   catch(SQLException e)
   {
       System.out.println(e);
   }
 }
}
