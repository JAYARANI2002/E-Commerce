import java.sql.*;
import java.util.*;
public class DataBaseController
{
   static Connection connection=null;
   static
   {
       try
       {
            
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/e_commerce","postgres","1234");
       }
       catch(Exception e)
       {
            System.out.println("Connection fail");
       }
   }
   public void createTable(String createTable)
   {
      try
      {
         
         PreparedStatement execute_createCategoryTable=connection.prepareStatement(createTable);
         execute_createCategoryTable.execute();
      }
      catch(Exception e)
      {
         System.out.println("Table not created"+e);
      }
   }
   public PreparedStatement createPreparedStatement(String query)throws Exception
   {
       PreparedStatement stmt=connection.prepareStatement(query);
       return stmt;
   }
   //public 
}
