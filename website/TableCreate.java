import java.sql.*;
import java.util.*;
public class TableCreate
{
   public void  createCategoryTable()
   {
         String createCategory_Table="create table if not exists Category(id int primary key,category varchar(100) unique)";
         new DataBaseController().createTable(createCategory_Table);
   }
   public void  createCustomerTable()
   {
         String createCustomer_Table="create table if not exists Customer(id serial primary key,name varchar(20),username varchar(30) not null unique,password varchar(8) not null,location varchar(200))";
         new DataBaseController().createTable(createCustomer_Table);
   }
   public void createProductTable()
   {
         String createProduct_Table="create table if not exists Product(id serial primary key,code int not null unique,category_id int references category(id),name varchar(100) unique,price decimal(16,2))";
         new DataBaseController().createTable(createProduct_Table);
   }
   public void createAdminTable()
   {
         String createAdmin_Table="create table if not exists Admin"+"(id serial primary key,"+"name varchar(15),"+"username varchar(10) not null unique,"+"password varchar(8))";
         new DataBaseController().createTable(createAdmin_Table);
   }
   
   
   
   
   
}
