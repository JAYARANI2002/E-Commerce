//package com.mypack.stock;
import java.sql.*;
import java.util.Scanner;
public class Management
{
   private Management(){}
   static Connection c;
   static Scanner sc=new Scanner(System.in);
   static
   {
       try
       {
            c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/stocktrading","postgres","1234");
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }
   public static void createAccountTable()
   {
      try
      {
        String create="create table if not exists Account(id serial primary key,Name varchar(10) not null,UserName varchar(10) unique not null,Password varchar(8) not null,phonenumber varchar(10) unique not null);";
        PreparedStatement execute=c.prepareStatement(create);
        execute.execute();
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
   }  
   public static void createPurchaseStockTable()
   {
      try
      {
        String create="create table if not exists purchaseStock(id serial primary key,portfolio_id int references portfolio(id),stock_id int references stock(id),buying_date date,stock_price decimal(10,2),Quantity int,current_price decimal(10,2),selling_date date,profit decimal(10,2)) ;";
        PreparedStatement execute=c.prepareStatement(create);
        execute.execute();
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
   } 
   public static void createStockTable()
   {
      try
      {
        String create="create table if not exists Stock(id serial primary key,Name varchar(10) not null unique,Price Decimal(10,2) not null check(Price>0));";
        PreparedStatement execute=c.prepareStatement(create);
        execute.execute();
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
   }
   public static void createPortfolioTable()
   {
      try
      {
        String create="create table if not exists Portfolio(id serial primary key,account_id int references account(id) unique,Amount decimal(10,2) check(amount>0),total_profit decimal(10,2) default 0)";
        PreparedStatement execute=c.prepareStatement(create);
        execute.execute();
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
   }
   public static int createPortfolio(int account_id,double amount)
   {
       int portfolio_id=0;
       try
       {
           String create="insert into portfolio(account_id,amount) values(?,?);";
           PreparedStatement execute=c.prepareStatement(create);
           execute.setInt(1,account_id);
           execute.setDouble(2,amount);
           execute.executeUpdate();
           portfolio_id=getPortfolioId(account_id);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       return portfolio_id;
   }
   public static void updatePortfolio(int portfolio_id,double amount)throws SQLException
   {
        String update="update portfolio set amount=? where id=?";
        PreparedStatement execute=c.prepareStatement(update);
        execute.setDouble(1,getUserAmount(portfolio_id)+amount);
        execute.setInt(2,portfolio_id);
        execute.executeUpdate();
   }
   public static boolean selectStock(int portfolio_id)throws SQLException
   {
       ResultSet rs=null;
       try
       {
           String select="select * from stock where price<=?";
           PreparedStatement execute=c.prepareStatement(select);
           execute.setDouble(1,getUserAmount(portfolio_id));
           rs=execute.executeQuery();
           if(rs.next())
           {
              System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
           while(rs.next())
           {
              System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
           }
           return true;
          }
          else
          {
            System.out.println("There is no stock available");
          }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       return rs.next();
    }
  public static void displayStock()throws SQLException
   {
       ResultSet rs=null;
       try
       {
           String select="select * from stock";
           PreparedStatement execute=c.prepareStatement(select);
           rs=execute.executeQuery();
           while(rs.next())
           {
              System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
   public static boolean selectBuyStock(int portfolio_id)throws SQLException
   {
       boolean data=false;
       ResultSet rs=null;
       try
       {
           String select="select stock_id,stock.name,stock_price from purchaseStock join stock on stock.id=stock_id where portfolio_id=?";
           PreparedStatement execute=c.prepareStatement(select);
           execute.setInt(1,portfolio_id);
           rs=execute.executeQuery();
           if(rs.next())
           {
            data=true;
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
            while(rs.next())
            {
              System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
            }
           }
          else
          {
               System.out.println("You didn't hava a stock right now");
          }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       
       return data;
    }
   public static void insertAccount(Account account)
   {
       try
       {
           String insert="insert into Account (Name,UserName,Password,PhoneNumber) values (?,?,?,?);";
           PreparedStatement execute=c.prepareStatement(insert);
           execute.setString(1,account.getName());
           execute.setString(2,account.getUserName());
           execute.setString(3,account.getPassword());
           execute.setString(4,account.getPhone());
           execute.executeUpdate();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }
   public static void addStock(Stock stock)
   {
       try
       {
           String insert="insert into Stock (Name,Price) values (?,?);";
           PreparedStatement execute=c.prepareStatement(insert);
           execute.setString(1,stock.getName());
           execute.setDouble(2,stock.getPrice());
           execute.executeUpdate();
       } 
       catch(Exception e)
       {
           System.out.println(e);
       }
   }
   public static void updateStockPrice()
   {
       try
       {
          String select="SELECT name,price from stock";
          PreparedStatement execute=c.prepareStatement(select);
          ResultSet rs=execute.executeQuery();
          while(rs.next())
          {
               double current_price=Stock.getCurrentPrice(rs.getDouble(2));
               String stock_name=rs.getString(1);
               String update="update stock set price=? where name=?;";
               PreparedStatement execute_update=c.prepareStatement(update);
               execute_update.setDouble(1,current_price);
               execute_update.setString(2,stock_name);
               execute_update.executeUpdate();
          }
       }
       catch(Exception e)
       {
            System.out.println(e);
       }
   }
   public static int validateAccount(String username,String password)
   {
       try
       {
        String validateCustomer="Select password,id from account where username=?";
        PreparedStatement execute_validateCustomer=c.prepareStatement(validateCustomer);
        execute_validateCustomer.setString(1,username);
        ResultSet rs=execute_validateCustomer.executeQuery();
        if(rs.next())
        {
           String pass=rs.getString(1);
           if(pass.equals(password))
           {
               return rs.getInt(2);
           }
        }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      return -1;
   }
   public static String getStockName(int stock_id) 
   {
       try
       {
        String getname="Select name from stock where id=?";
        PreparedStatement execute=c.prepareStatement(getname);
        execute.setInt(1,stock_id);
        ResultSet rs1=execute.executeQuery();
        if(rs1.next())
        {
           return rs1.getString(1);
        }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      return null;
   }
   public static double getStockPrice(int stockid) 
   {
       System.out.println("get price "+stockid);
       double stock_price=0;
       try
       {
        String getprice="Select price from stock where id=?";
        PreparedStatement execute=c.prepareStatement(getprice);
        execute.setInt(1,stockid);
        ResultSet rs1=execute.executeQuery();
        if(rs1.next())
        {
            stock_price=rs1.getDouble(1);
            System.out.println(stock_price);
        }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      return stock_price;
   }
   public static void buyStock(int stockId,int portfolio_id)
   {
       try
       {
        String insert="insert into purchaseStock(portfolio_id,stock_id,stock_price,Quantity,buying_date) values(?,?,?,?,now())";
        /*String buy="update portfolio set buying_date=now(),stock_name=?,stock_price=?,amount=? where account_id=?";
        PreparedStatement execute=c.prepareStatement(buy);
        //execute.setDate(1,
        execute.setString(1,getStockName(stockId));
        double price=getStockPrice(stockId);
        execute.setDouble(2,price);
        execute.setDouble(3,getUserAmount(account_id)-price);
        execute.setInt(4,account_id);
        execute.executeUpdate();*/
        PreparedStatement execute=c.prepareStatement(insert);
        execute.setInt(1,portfolio_id);
        execute.setInt(2,stockId);
        double price=getStockPrice(stockId);
        execute.setDouble(3,price);
        System.out.println("Enter the quantity");
        int n=sc.nextInt();
        execute.setInt(4,n);
        updatePortfolio(portfolio_id,n*price*-1);
        updateBuyingDate(portfolio_id);
        execute.executeUpdate();
        
        System.out.println("============================");
        System.out.println("    insert successfully     ");
        System.out.println("============================");
        
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
   }
   public static void updateBuyingDate(int portfolio_id)throws SQLException
   {
       String update="update purchaseStock set buying_date=now() where portfolio_id=?";
       PreparedStatement execute=c.prepareStatement(update);
        execute.setInt(1,portfolio_id);
        execute.executeUpdate();
   }
   public static void sellStock(int portfolio_id,int stock_id)
   {
       try
       {
        String buy="update purchaseStock set selling_date=now(),current_price=? where portfolio_id=? ";
        PreparedStatement execute=c.prepareStatement(buy);;
        double price=getStockPrice(stock_id);
        
        execute.setDouble(1,price);
        execute.setInt(2,portfolio_id);
        
        double profit=getProfit(portfolio_id,stock_id);
        updateStockProfit(portfolio_id,profit);
        execute.executeUpdate();
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
   }
   public static double getProfit(int portfolio_id,int stock_id)throws SQLException
   {
        String select="select profit from purchasestock where portfolio_id=? and stock_id=?";
        PreparedStatement execute=c.prepareStatement(select);
        execute.setInt(1,portfolio_id);
        execute.setInt(2,stock_id);
        ResultSet rs=execute.executeQuery();
        if(rs.next())
        {
             System.out.println(rs.getDouble(1));
             return rs.getDouble(1);
        }
        return -1;
   }
   public static void updateStockProfit(int portfolio_id,double profit)throws Exception
   {
       String update="update purchaseStock set profit=current_price-stock_price where portfolio_id=?";
       PreparedStatement execute=c.prepareStatement(update);
       execute.setDouble(1,portfolio_id);
       execute.executeUpdate();
       
       updateTotalProfit(portfolio_id,profit);
   }
   public static void updateTotalProfit(int portfolio_id,double profit)throws Exception
   {
       String update="update portfolio set total_profit=? where id=?";
       PreparedStatement execute=c.prepareStatement(update);
       execute.setDouble(1,getUserAmount(portfolio_id)+profit);
       execute.setInt(2,portfolio_id);
       execute.executeUpdate();
   }
   public static int getAccountId(String username,String password) 
   {
       try
       {
        String validateCustomer="Select id,password from account where username=?";
        PreparedStatement execute_validateCustomer=c.prepareStatement(validateCustomer);
        execute_validateCustomer.setString(1,username);
        ResultSet rs1=execute_validateCustomer.executeQuery();
        if(rs1.next())
        {
           String pass=rs1.getString(2);
           if(pass.equals(password))
           {
               return rs1.getInt(1);
           }
        }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
        return -1;
   }
   public static int getStockId(int portfolioId) 
   {
       System.out.println("Portfolio id"+portfolioId);
       String stock_name="";
       int id=0;
       try
       {
        String getName="Select stock_name from portfolio where id=?";
        PreparedStatement execute=c.prepareStatement(getName);
        execute.setInt(1,portfolioId);
        ResultSet rs1=execute.executeQuery();
        if(rs1.next())
        {
             stock_name=rs1.getString(1);
             id=getBuyStockId(stock_name);
        }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
        return id;
   }
   public static int getBuyStockId(String name)throws SQLException
   {
        String select="select id from stock where name=?";
        PreparedStatement execute=c.prepareStatement(select);
        execute.setString(1,name);
        ResultSet rs=execute.executeQuery();
        if(rs.next())
        {
           System.out.println(rs.getInt(1));
           return rs.getInt(1);
        }
        return -1;
   }
   public static int getPortfolioId(int account_id)throws SQLException
   {
        int portfolioId=0;
        String select="select id from portfolio where account_id=?";
        PreparedStatement execute=c.prepareStatement(select);
        execute.setInt(1,account_id);
        ResultSet rs=execute.executeQuery();
        if(rs.next())
        {
           portfolioId=rs.getInt(1);
        }
        return portfolioId;
   }
   public static double getUserAmount(int portfolio_id) 
   {
       try
       {
        String getAmount="Select amount from portfolio where id=?";
        PreparedStatement execute=c.prepareStatement(getAmount);
        execute.setInt(1,portfolio_id);
        ResultSet rs1=execute.executeQuery();
        if(rs1.next())
        {
           return rs1.getDouble(1);
        }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      return -1;
   }
   public static void close()
   {
      try
      {
        c.close();
      }
      catch(SQLException e)
      {
        System.out.println(e);
      }
   }
}
