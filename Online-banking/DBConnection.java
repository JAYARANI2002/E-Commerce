import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection
{
   static Connection c=null;
   public static Connection getDBConnection()throws SQLException
   {
     try
     {
         Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/onlinebanking","postgres","1234");
     }
     catch(Exception e)
     {
        System.out.println(e);
     }
     return c;
   }
}
