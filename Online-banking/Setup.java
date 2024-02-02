import java.sql.*;
public class Setup
{
    private Connection c;
    public Setup()
    {
      try
      {
         this.c=DBConnection.getDBConnection();
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
    }
    public void createCustomerTable()
    {
       try
       {  
          String createTable="create table if not exists Customer(id int primary key,name varchar(10) not null,place varchar(10),email varchar(20) unique,phoneno long not null );";
          PreparedStatement execute_createTable=c.prepareStatement(createTable);
          execute_createTable.execute();
       }
       catch(SQLException e)
       {
            System.out.println("Table not created");
       }
   }
   public void createBankTable()
   {
       try
       {  
          String createTable="create table if not exists Bank(id int primary key,name varchar(10) not null,branch varchar(20) not null,place varchar(10),email varchar(20) unique,phoneno long not null,IFSC_code int unique );";
          PreparedStatement execute_createTable=c.prepareStatement(createTable);
          execute_createTable.execute();
       }
       catch(SQLException e)
       {
            System.out.println("Table not created");
       }
   } 
   public void createAdminTable()
   {
      try
      {
         String createAdmin_Table="create table if not exists Admin (id serial primary key,name varchar(15),username varchar(10) not null unique,password varchar(8));";
         PreparedStatement execute_createAdminTable=c.prepareStatement(createAdmin_Table);
         execute_createAdminTable.execute();
      }
      catch(Exception e)
      {
         System.out.println("Table not created");
      }
   }
   public void createAccountTable() throws SQLException
   {
       try
       {  
          String createTable="create table if not exists Account(id int primary key,customer_id int references customer(id),bank_id int references bank(id),Amount double default=0);";
          PreparedStatement execute_createTable=c.prepareStatement(createTable);
          execute_createTable.execute();
       }
       catch(SQLException e)
       {
            System.out.println("Table not created");
       }
   }         
}  
