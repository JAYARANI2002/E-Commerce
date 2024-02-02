import java.sql.*;
import java.util.*;
public class CustomerModel
{
   
   public void addCustomer(Customer customer)
   {
         try
         {
            String addCustomer="insert into Customer(name,username,password) values (?,?,?)";
            PreparedStatement execute_addCustomer=new DataBaseController().createPreparedStatement(addCustomer);
            execute_addCustomer.setString(1,customer.getName());
            execute_addCustomer.setString(2,customer.getUserName());
            execute_addCustomer.setString(3,customer.getUserPassword());
            execute_addCustomer.executeUpdate();
            System.out.println("Date inserted successfully");
         }
         catch(Exception e)
         {
            System.out.println("data is not inserted");
         }
   }
   public boolean validateCustomer(String username,String password) throws Exception
   {
        String validateCustomer="Select password from Customer where username=?";
        PreparedStatement execute_validateCustomer=new DataBaseController().createPreparedStatement(validateCustomer);
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
   
}
