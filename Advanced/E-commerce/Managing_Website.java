import java.sql.*;
import java.util.*;
import java.time.*;
import java.text.*;
import java.time.format.DateTimeFormatter;
public class Managing_Website
{
   static Connection connection;
   static Scanner sc=new Scanner(System.in);
   static
   {
       try
       {
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/e_commerce","postgres","1234");
       }
       catch(Exception e)
       {
            System.out.println("Connection fail...");
       }
   }
   public void createCategoryTable()
   {
      try
      {
         String createCategory_Table="create table if not exists Category(id int primary key,category varchar(100) unique)";
         PreparedStatement execute_createCategoryTable=connection.prepareStatement(createCategory_Table);
         execute_createCategoryTable.execute();
      }
      catch(Exception e)
      {
         System.out.println("Table not created");
      }
   }
   public void createAdminTable()
   {
      try
      {
         String createAdmin_Table="create table if not exists Admin"+"(id serial primary key,"+"name varchar(15),"+"username varchar(10) not null unique,"+"password varchar(8))";
         PreparedStatement execute_createAdminTable=connection.prepareStatement(createAdmin_Table);
         execute_createAdminTable.execute();
      }
      catch(Exception e)
      {
         System.out.println("Table not created");
      }
   }
   public void createCustomerTable()
   { 
         try
         {
               String createCustomerTable="create table if not exists Customer(id serial primary key,name varchar(20),username varchar(30) not null unique,password varchar(8) not null,location varchar(200))";
               PreparedStatement execute_createCustomerTable=connection.prepareStatement(createCustomerTable);
               execute_createCustomerTable.execute();
         }
         catch(SQLException e)
         {
               System.out.println("Table is not created");
         }
   }
   
   public void createStockproductTable()
   { 
         try
         {
               String createStockproductTable="create table if not exists STOCKPRODUCT ( id serial, PRODUCT_ID int REferences PRODUCT(id),code int primary key);";
          PreparedStatement execute_createStockTable=connection.prepareStatement( createStockproductTable);
               execute_createStockTable.execute();
         }
         catch(SQLException e)
         {
               System.out.println("Table is not created");
         }
   }
   public void addCustomer(Customer customer)
   {
        try
        {
              String addCustomer="insert into Customer (name,username,password,location) values(?,?,?,?)";
              PreparedStatement execute_addCustomer=connection.prepareStatement(addCustomer);
              execute_addCustomer.setString(1,customer.getName());
              execute_addCustomer.setString(2,customer.getUserName());
              execute_addCustomer.setString(3,customer.getPassword());
              execute_addCustomer.setString(4,customer.getLocation().toString());
              execute_addCustomer.executeUpdate();
        }
        catch(SQLException e)
        {
              System.out.println("Data not inserted");
        }
   } 
   public void addCategory()
   {
	       try
	       {
		 String insertCategory="insert into Category(id,category) values(?,?)";
		 PreparedStatement execute_insertCategory=connection.prepareStatement(insertCategory);
		 System.out.println("Enter the category id");
		 int id=sc.nextInt();
		 System.out.println("Enter the category name");
		 String cat_name=sc.next();
		 execute_insertCategory.setInt(1,id);
		 execute_insertCategory.setString(2,cat_name);
		 execute_insertCategory.executeUpdate();
	       }
	       catch(SQLException e)
	       {
	          e.printStackTrace();
		  System.out.println("Data not inserted");
	       }
   }  
   public void createProductTable()
   {
      try
      {
         String createProduct_Table="create table if not exists Product(id serial primary key,code int not null unique,category_id int references category(id),name varchar(100) unique,price decimal(16,2))";
         PreparedStatement execute_createProductTable=connection.prepareStatement(createProduct_Table);
         
         execute_createProductTable.execute();
      }
      catch(Exception e)
      {
         System.out.println("Table not created");
      }
   }
   public void selectProduct(String category)
   {
      try
      {
           String displayProduct="select product.id,category,product.name,product.price from category join product on category.id=product.category_id where category=?";
           PreparedStatement execute_displayProduct=connection.prepareStatement(displayProduct);
           execute_displayProduct.setString(1,category);
           ResultSet rs2=execute_displayProduct.executeQuery();
           System.out.println("\n======================================================");
           while(rs2.next())
           {
                 System.out.println(rs2.getInt(1)+"\t"+rs2.getString(2)+"\t"+rs2.getString(3)+"\t"+rs2.getString(4));
           } 
           System.out.println("\n======================================================");    
      }
      catch(SQLException e)
      {
           System.out.println("Exception raised");
      }
  }
  public void displayProduct(int id)
   {
      try
      {
           String display="select STOCKPRODUCT.code ,category,name,price from product join stockproduct ON PRODUCT.ID =?join category on product.category_id=category.id;";
           PreparedStatement execute_display=connection.prepareStatement(display);
           execute_display.setInt(1,id);
           ResultSet rs5=execute_display.executeQuery();
           System.out.println("\n======================================================");
           while(rs5.next())
           {
                 System.out.println(rs5.getInt(1)+"\t"+rs5.getString(2)+"\t"+rs5.getString(3)+"\t"+rs5.getFloat(4));
           } 
           System.out.println("\n======================================================");    
      }
      catch(SQLException e)
      {
           System.out.println("Exception raised");
      }
  }
  public String showAvailability(int id)
  {
    String availability=null;
    try
    {
      String checkAvailability="select count(code) from stockproduct where product_id=?";
      PreparedStatement execute_checkAvailability=connection.prepareStatement(checkAvailability);
      execute_checkAvailability.setInt(1,id);
      ResultSet  rs3=execute_checkAvailability.executeQuery();  
      if(rs3.next())
      {
         availability=(rs3.getInt(1)>1?"IN STOCK":"OUT OF STOCK :( ");
      }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    return availability;
  }
  public void createOrderTable()
  {
    try
    {
       String createOrderTable="create table if not exists Orders(id int,customerId int references customer(id),productId int references stockproduct(code),purchase_date timestamp,delivery_date timestamp,transaction varchar(30));";
       PreparedStatement execute_createOrderTable=connection.prepareStatement(createOrderTable);
       execute_createOrderTable.execute();
    }
    catch(Exception e)
    {
        System.out.println("Table not created");
    }
  }     
  public void placeOrder(int productid,int customerid)
  {
    try
    {
       createOrderTable();
       String insertOrder="insert into Orders values(?,?,?,?,?,?)";
       PreparedStatement execute_insertOrder=connection.prepareStatement(insertOrder);
       System.out.println("Enter the table id");
       execute_insertOrder.setInt(1,sc.nextInt());
       execute_insertOrder.setInt(2,customerid);
       execute_insertOrder.setInt(3,productid);
       String pattern="yyyy:MM:dd HH:mm:ss";
       DateTimeFormatter dtf=DateTimeFormatter.ofPattern(pattern);
       LocalDateTime l=LocalDateTime.now();
       SimpleDateFormat sdf=new SimpleDateFormat(pattern);
       execute_insertOrder.setTimestamp(4,Timestamp.valueOf(l));
       execute_insertOrder.setTimestamp(5,Timestamp.valueOf(l.plusDays(2)));
       System.out.println("Mode of Transaction");
       execute_insertOrder.setString(6,sc.next());
       execute_insertOrder.executeUpdate();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
  }       
  public void insertAdmin(Admin admin)
   {
         try
         {
            String addAdmin="insert into Admin(name,username,password) values (?,?,?)";
            PreparedStatement execute_addAdmin=connection.prepareStatement(addAdmin);
            execute_addAdmin.setString(1,admin.getName());
            execute_addAdmin.setString(2,admin.getUserName());
            execute_addAdmin.setString(3,admin.getUserPassword());
            execute_addAdmin.executeUpdate();
            System.out.println("Date inserted successfully");
         }
         catch(Exception e)
         {
            System.out.println("data is not inserted");
         }
   }
   public boolean validateAdmin(String username,String password) throws Exception 
   {
        String validateAdmin="Select password from Admin where username=?";
        PreparedStatement execute_validateAdmin=connection.prepareStatement(validateAdmin);
        execute_validateAdmin.setString(1,username);
        ResultSet rs1=execute_validateAdmin.executeQuery();
        if(rs1.next())
        {
           String pass=rs1.getString(1);
           if(pass.equals(password))
           {
               return true;
           }
        }
        return false;
   }    
   public void closeConnection()
   {
       try
       {
          connection.close();
          System.out.println("Connection closed");
       }
       catch(Exception e)
       {
          System.out.println("Exception in close connection");
       }
   }
   public void addProduct(Product product)
   {
     try
     {
       String addProduct="insert into Product(id,code,category_id,name,price) values (?,?,?,?,?)" ;
       PreparedStatement execute_addProduct=connection.prepareStatement(addProduct);
       System.out.println("Enter the id");
       int id=sc.nextInt();
       execute_addProduct.setInt(2,product.getCode());
       execute_addProduct.setString(4,product.getName());
       execute_addProduct.setFloat(5,product.getPrice());
       int p_id=selectCategory();
       execute_addProduct.setInt(3,p_id);
       execute_addProduct.executeUpdate();
       addStock(id,product.getCode());
     }
     catch(Exception e)
     {
        System.out.println(e);
     }
   }
   public void insertIntoStock(int id,int code)
   {
    try
    {
       String insertStock="insert into STOCKPRODUCT (PRODUCT_ID,CODE) values (?,?)";
       PreparedStatement execute_insertStock=connection.prepareStatement(insertStock);
       execute_insertStock.setInt(1,id);
       execute_insertStock.setInt(2,code);
       execute_insertStock.executeUpdate();
    }
    catch(Exception e)
    {
       System.out.println(e);
    }
   }
   public void addStock(int id,int code)
   {
      createStockproductTable();  
      try
      {
          
          for(int i=1;i<=10;i++)
          {
             insertIntoStock(id,code+i);
          }
      }
      catch(Exception e)
      {
          System.out.println("Table not created");
      }
   }
   public void removeProduct(int code)
   {
     try
     {
       String deleteProduct="delete from product where code =?" ;
       PreparedStatement execute_deleteProduct=connection.prepareStatement(deleteProduct);
       execute_deleteProduct.setInt(1,code);
       execute_deleteProduct.executeUpdate();
       
     }
     catch(Exception e)
     {
        System.out.println(e);
     }
       
   }
   public int selectCategory()
   {
        Categories categoryArray[]=Categories.values();
        for(Categories i:categoryArray)
        {
            int count=i.ordinal()+1;
            System.out.println(count+" :  "+ i);
        }
        int id=sc.nextInt();
        return id;
   }
   
   public boolean validateCustomer(String username,String password) throws Exception
   {
        String validateCustomer="Select password from Customer where username=?";
        PreparedStatement execute_validateCustomer=connection.prepareStatement(validateCustomer);
        execute_validateCustomer.setString(1,username);
        ResultSet rs1=execute_validateCustomer.executeQuery();
        if(rs1.next())
        {
           String pass=rs1.getString(1);
           if(pass.equals(password))
           {
               return true;
           }
        }
        return false;
   }
   public int getCustomerId(String user_name)
   {
      int id=0; 
      try
      {
        String getId="select id from customer where username=?";
        PreparedStatement execute_getId=connection.prepareStatement(getId);
        execute_getId.setString(1,user_name);
        ResultSet rs4=execute_getId.executeQuery();
        if(rs4.next())
        {
            id=rs4.getInt(1);
        }
     }
     catch(Exception e)
     {
         System.out.println("Data not found");
     }
     return id;
   }
}
