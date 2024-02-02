import java.sql.*;
import java.util.*;
public class AdminModel
{
   
   public void insertAdmin(Admin admin)
   {
         try
         {
            String addAdmin="insert into Admin(name,username,password) values (?,?,?)";
            PreparedStatement execute_addAdmin=new DataBaseController().createPreparedStatement(addAdmin);
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
        PreparedStatement execute_validateAdmin=new DataBaseController().createPreparedStatement(validateAdmin);
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
   
}
