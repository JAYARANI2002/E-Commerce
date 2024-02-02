import java.sql.*;
public class AdminDAO
{
   private Connection c=null;
   AdminDAO()
   {
      try
      {
          c=DBConnection.getDBConnection();
      }
      catch(Exception e)
      {
          System.out.println("Connection fail");
      }
   }
   public void insertAdmin(Admin admin)
   {
      try
         {
            String addAdmin="insert into Admin(name,username,password) values (?,?,?)";
            PreparedStatement execute_addAdmin=c.prepareStatement(addAdmin);
            execute_addAdmin.setString(1,admin.getName());
            execute_addAdmin.setString(2,admin.getUserName());
            execute_addAdmin.setString(3,admin.getUserPassword());
            execute_addAdmin.executeUpdate();
            System.out.println("Data inserted successfully");
         }
         catch(Exception e)
         {
            System.out.println("data is not inserted");
         }
   }
   public boolean validateAdmin(String username,String password) 
   {
       try
       {
        String validateAdmin="Select password from Admin where username=?";
        PreparedStatement execute_validateAdmin=c.prepareStatement(validateAdmin);
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
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
        return false;
   } 
  }
